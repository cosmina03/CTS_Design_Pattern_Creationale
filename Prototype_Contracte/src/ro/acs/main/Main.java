package ro.acs.main;

import ro.acs.clase.AContract;
import ro.acs.clase.ContractCorporate;
import ro.acs.clase.PrototypeContractFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        AContract contractInitial=new ContractCorporate();
//        contractInitial.addClauzaPersonalizata("Clauza 3 ------");
//        System.out.println(contractInitial);
//      //  AContract contract2= (AContract) contractInitial.clone();
//       // System.out.println(contract2);
        AContract contractNou= PrototypeContractFactory.getPrototipContract("corporate");
        System.out.println(contractNou);
        contractNou.addClauzaPersonalizata("asaklnkb");
        AContract contract2= (AContract) contractNou.clone();
        System.out.println(contract2);


    }
}