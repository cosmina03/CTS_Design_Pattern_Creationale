package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class APantof implements Cloneable {
    protected ETipPantof tipPantof;
    protected EStilPantof stilPantof;
    protected List<String> listaMesaje;
    protected int marimePantof;
    protected String culoare;

    //adauga un nou mesaj text care o sa fie inscriptionat pe pantof
    public abstract void addMesaj(String mesaj);

    //calculeaza pretul folosind o formula ce utilizeaza tipPantof,
    //listaMesaje si marimePantof
    public abstract void calculeazaPret();

    public void setTipPantof(ETipPantof tipPantof) {
        this.tipPantof = tipPantof;
    }

    public void setStilPantof(EStilPantof stilPantof) {
        this.stilPantof = stilPantof;
    }

    public void setMarimePantof(int marimePantof) {
        this.marimePantof = marimePantof;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("APantof{");
        sb.append("tipPantof=").append(tipPantof);
        sb.append(", stilPantof=").append(stilPantof);
        sb.append(", listaMesaje=").append(listaMesaje);
        sb.append(", marimePantof=").append(marimePantof);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        APantof clonat=(APantof) super.clone();
        clonat.culoare=this.culoare;
        clonat.marimePantof=this.marimePantof;
        clonat.stilPantof=this.stilPantof;
        clonat.tipPantof=this.tipPantof;
        clonat.listaMesaje=new ArrayList<>();
        for(String m : this.listaMesaje){
            clonat.listaMesaje.add(new String(m));
        }
        return clonat;
    }
}

