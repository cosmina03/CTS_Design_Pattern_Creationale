package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class AContract implements Cloneable{
    protected String tip;
    protected List<String> listaClauze;

    public abstract void addClauzaPersonalizata(String clauza);

    public abstract void printare();
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AContract{");
        sb.append(", tip='").append(tip).append('\'');
        sb.append(", listaClauze=").append(listaClauze);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AContract contractClona= (AContract) super.clone();
        contractClona.tip=this.tip;
        contractClona.listaClauze=new ArrayList<>(this.listaClauze);
        return contractClona;
    }
}
