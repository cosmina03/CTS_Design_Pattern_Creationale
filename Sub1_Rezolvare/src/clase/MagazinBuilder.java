package clase;


import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder implements IBuilder{
    //mergem pe varianta in care ne luam toate atributele in clasa
    private IPodea podea=new PodeaStandard();
    private List<IDecoratiuni> listaDecoratiuni = new ArrayList<>();
    private float suprafata;
    private int nrIntrari=1;
    private String denumire;

    public MagazinBuilder(String denumire, float suprafata, int nrIntrari){
        this.denumire=denumire;
        this.suprafata=suprafata;
        this.nrIntrari=nrIntrari;
    }

    public MagazinBuilder setPodea(IPodea podea) {
        this.podea = podea;
        return this;
    }

    public MagazinBuilder setListaDecoratiuni(IDecoratiuni decoratiuni) {
        this.listaDecoratiuni.add(decoratiuni);
        return this;
    }
    public MagazinBuilder reset(String denumire, float suprafata, int nrIntrari) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.podea = new PodeaStandard();
        this.listaDecoratiuni = new ArrayList<>();
        return this;
    }


    @Override
    public Magazin build() {
        int nrMinimIntrari=(int)this.suprafata/100;
        if(this.suprafata%100!=0){
            nrMinimIntrari+=1;
        }

        if(nrMinimIntrari>this.nrIntrari){
            throw new ExceptieIntrari("Nu sunt suficiente intrari la magazinul" +this.denumire);
        }
        Magazin magazin= new Magazin(this.podea, this.suprafata,this.nrIntrari,this.denumire);

        for(IDecoratiuni decor : this.listaDecoratiuni){
            try {
                magazin.addDecoratiune(decor);
            }catch (ExceptieDecoratiune e){
                System.out.println(e.getMessage());
            }
        }


        return magazin;
    }
}
