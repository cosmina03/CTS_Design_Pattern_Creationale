package clase;


import java.util.ArrayList;

public class Magazin extends AMagazin {
    // Asta trebuie sa fie default
    Magazin(IPodea podea, float suprafata, int nrIntrari, String denumire) {
        super(podea, suprafata, nrIntrari, denumire);
        this.listaDecoratiuni = new ArrayList<IDecoratiuni>();
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());
    }

    @Override
    public float calculGradIncendiu() {
        //aici creezi cum vrei tu
        float grad = (10-this.podea.getDuritate());
        for(IDecoratiuni decoratiune : this.listaDecoratiuni) {
            if(decoratiune.getMaterial()==ETipMaterial.LEMN)
                grad++;
        }
        return grad;
    }

    @Override
    public void addDecoratiune(IDecoratiuni m) throws ExceptieDecoratiune {
        if(m.getMaterial()==ETipMaterial.STICLA && this.podea.getDuritate()<2)
            throw new ExceptieDecoratiune("Nu e potrivita sticla");

        this.listaDecoratiuni.add(m);
    }

    @Override
    public String toString() {
        return "Magazin [podea=" + podea + ", listaDecoratiuni=" + listaDecoratiuni + ", suprafata=" + suprafata
                + ", nrIntrari=" + nrIntrari + ", denumire=" + denumire + "]";
    }
}
