package ro.acs.clase;

import java.util.ArrayList;

public class ContractCorporate extends AContract{
    public ContractCorporate() {

        this.tip="Corporate";
        this.listaClauze=new ArrayList<>();
        listaClauze.add("Clauza 1 Corporate");
        listaClauze.add("Clauza 2 Corporate");
    }

    @Override
    public void addClauzaPersonalizata(String clauza) {
        listaClauze.add(clauza);

    }

    @Override
    public void printare() {
        System.out.println("Contractul de tip "+ this.tip);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ContractCorporate contractClona= (ContractCorporate) super.clone();
        contractClona.tip=this.tip;
       // contractClona.listaClauze=new ArrayList<>(this.listaClauze);
        contractClona.listaClauze=new ArrayList<>();
        for(String clauza : this.listaClauze){
            contractClona.listaClauze.add(new String(clauza));
        }

        return contractClona;
    }
}
