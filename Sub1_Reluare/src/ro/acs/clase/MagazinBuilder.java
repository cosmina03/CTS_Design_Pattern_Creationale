package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder implements IBuilder {
    protected IPodea podea=new PodeaStandard();
    protected List<IDecoratiuni> listaDecoratiuni = new ArrayList<>();
    protected float suprafata;
    protected int nrIntrari=1;
    protected String denumire;
    // Magazin magazin;

    public MagazinBuilder(){

    }


    public MagazinBuilder setPodea(IPodea podea) {
        this.podea = podea;
        return this;
    }

    public MagazinBuilder setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
        return this;
    }

    public MagazinBuilder addDecoratiune(IDecoratiuni decoratiune) {
       listaDecoratiuni.add(decoratiune);
        return this;
    }
    private void reset(){
        this.denumire=null;
        this.suprafata=0.0f;
        this.nrIntrari=1;
        this.podea=new PodeaStandard();
        this.listaDecoratiuni=new ArrayList<>();
    }

    @Override
    public Magazin build(String denumire,float suprafata) {

        int nrMinim=(int)suprafata/100;
        if(suprafata%100!=0){
            nrMinim++;
        }
        if(nrMinim>this.nrIntrari){
            throw new ExceptieIntrari("Nu sunt sufieciente intrari");
        }
        Magazin magazin=new Magazin(this.podea,suprafata,this.nrIntrari,denumire);

        for(IDecoratiuni decoratiuni : listaDecoratiuni){
            magazin.listaDecoratiuni.add(decoratiuni);
        }
        reset();
        return magazin;

    }
}
