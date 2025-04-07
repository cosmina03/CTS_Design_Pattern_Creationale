package ro.acs.clase;

import java.util.ArrayList;

public class PantofRock extends APantof{
    PantofRock(int marime, String culoare, ETipPantof tipPantof) {
        this.marimePantof=marime;
        this.culoare=culoare;
        this.tipPantof=tipPantof;
        this.stilPantof=EStilPantof.ROCK;
        this.listaMesaje=new ArrayList<>();
        listaMesaje.add("Pop fun ");
        listaMesaje.add("Love this style");
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
        int pret=125; //pt tipul Punk
        for(String mesaj : this.listaMesaje){
            pret+=10;
        }
        if(this.marimePantof>37){
            pret+=15;
        }

    }
}
