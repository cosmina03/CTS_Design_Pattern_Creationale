package ro.acs.clase;

import java.util.ArrayList;

public class PantofPunk extends APantof{

    PantofPunk(){
        this.stilPantof=EStilPantof.PUNK;
        this.listaMesaje=new ArrayList<>();
        listaMesaje.add("This is Punk");
        this.marimePantof=36;
        this.culoare="rosu";
        this.tipPantof=ETipPantof.BALERINI;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    }
}
