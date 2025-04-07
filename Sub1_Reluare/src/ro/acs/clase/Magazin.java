package ro.acs.clase;

import java.util.ArrayList;

public class Magazin extends AMagazin{

    Magazin(IPodea podea, float suprafata, int nrIntrari, String denumire) {
        super(podea, suprafata, nrIntrari, denumire);
        this.listaDecoratiuni=new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("podea=").append(podea);
        sb.append(", listaDecoratiuni=").append(listaDecoratiuni);
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());

    }

    @Override
    public float calculGradIncendiu() {
       float grad=0;
       grad=10- podea.getDuritate();
       for(IDecoratiuni decoratiuni : listaDecoratiuni){
           if(decoratiuni.getMaterial()==ETipMaterial.LEMN){
               grad+=3;
           }else if(decoratiuni.getMaterial()==ETipMaterial.PLASTIC){
               grad+=2;
           }else if(decoratiuni.getMaterial()== ETipMaterial.STICLA){
               grad++;
           }
       }
       return grad;

    }

    @Override
    public void addDecoratiune(IDecoratiuni m) throws ExceptieDecoratiune {
        if(podea.getDuritate()<2 && m.getMaterial()==ETipMaterial.STICLA){
            throw new ExceptieDecoratiune("NU poti adauga decoratiuni din sticla la duritate 2");
        }
        listaDecoratiuni.add(m);

    }
}
