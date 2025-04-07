package ro.acs.clase;

import java.util.ArrayList;

public class PantofPop extends APantof{

     PantofPop(int marime, String culoare, ETipPantof tipPantof) {
        this.marimePantof=marime;
        this.culoare=culoare;
        this.tipPantof=tipPantof;
        this.stilPantof= EStilPantof.POP;
        this.listaMesaje=new ArrayList<>();
        this.listaMesaje.add("Pop it up");
        this.listaMesaje.add("Brandul nostru");

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
        int pret=100; //pt tipul Pop
        for(String mesaj : this.listaMesaje){
            pret+=10;
        }
        if(this.marimePantof>40){
            pret+=15;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        APantof pantof=(APantof) super.clone();
        pantof.listaMesaje=new ArrayList<>();
        for(String m : this.listaMesaje){
          pantof.listaMesaje.add(new String(m));
        }
        return pantof;
    }
}
