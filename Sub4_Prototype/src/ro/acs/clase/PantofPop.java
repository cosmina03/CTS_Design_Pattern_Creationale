package ro.acs.clase;

import java.util.ArrayList;

public class PantofPop extends APantof{
    PantofPop(){
        this.stilPantof=EStilPantof.POP;
        this.tipPantof=ETipPantof.BALERINI;
        this.listaMesaje=new ArrayList<>();
        this.listaMesaje.add("love POP");
        this.marimePantof=36;
        this.culoare="rosu";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        APantof pantof= (APantof) super.clone();
        pantof.tipPantof=this.tipPantof;
        pantof.stilPantof=this.stilPantof;
        pantof.listaMesaje=new ArrayList<>(this.listaMesaje);
        pantof.marimePantof=this.marimePantof;
        pantof.culoare=this.culoare;
        return pantof;
    }

    @Override
    public void addMesaj(String mesaj) {
        int nrCaratere=0;
        for(String m : listaMesaje){
            nrCaratere+=m.length();
        }
        nrCaratere+=mesaj.length();
        if(nrCaratere>this.marimePantof){
            throw new ExceptieMesajPantof("Nu mai poti adauga mesaje custom");
        }

        listaMesaje.add(mesaj);

    }

    @Override
    public void calculeazaPret() {
        int pret=100;
        if(this.marimePantof>40 && tipPantof==ETipPantof.GHETE){
            pret+=50;
        }
        if(this.listaMesaje.size()>2){
            pret+=25;
        }
        System.out.println("pretul pantofului este de "+ pret);
    }
}
