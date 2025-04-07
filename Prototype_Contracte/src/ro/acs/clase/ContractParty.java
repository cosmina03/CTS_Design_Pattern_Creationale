package ro.acs.clase;

import java.util.ArrayList;

public class ContractParty extends AContract{
    public ContractParty() {
        this.tip="Party";
        this.listaClauze=new ArrayList<>();
        listaClauze.add("Clauza 1 Party");
        listaClauze.add("Clauza 2 Party");

    }

    @Override
    public void addClauzaPersonalizata(String clauza) {
        listaClauze.add(clauza);
    }

    @Override
    public void printare() {
        System.out.println("Contract de tip "+ this.tip);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AContract contractClona= (AContract) super.clone();
        contractClona.tip=this.tip;
        contractClona.listaClauze=new ArrayList<>(this.listaClauze);
        return contractClona;
    }
}
