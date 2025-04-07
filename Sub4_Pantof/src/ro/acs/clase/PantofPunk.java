package ro.acs.clase;

import java.util.ArrayList;

public class PantofPunk extends APantof{

    PantofPunk(int marime, String culoare, ETipPantof tipPantof) {
        this.marimePantof=marime;
        this.culoare=culoare;
        this.tipPantof=tipPantof;
        this.stilPantof= EStilPantof.PUNK;
        this.listaMesaje=new ArrayList<>();
        listaMesaje.add("Punk fun");
        listaMesaje.add("Brandul nostru");
    }

    @Override
    public void addMesaj(String mesaj) {
        int nrCaractere=0;
        for(String m : listaMesaje){
            nrCaractere+=m.length();
        }
        nrCaractere+=mesaj.length();
        if(nrCaractere<this.marimePantof){
            listaMesaje.add(mesaj);
        }else {
            throw new ExceptieMesaj("Nu mai poti adauga mesaje");
        }

    }

    @Override
    public void calculeazaPret() {
        int pret=150; //pt tipul Punk
        for(String mesaj : this.listaMesaje){
            pret+=10;
        }
        if(this.marimePantof>40){
            pret+=15;
        }

    }
}
