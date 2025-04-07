package ro.acs.main;

import ro.acs.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        APantof pantofClient= PrototypeFactoryPantofi.getPrototipPantof(EStilPantof.POP);
        pantofClient.setMarimePantof(42);
        pantofClient.setTipPantof(ETipPantof.BALERINI);
        pantofClient.addMesaj("NOUU");
        System.out.println(pantofClient);
        APantof pantof2=PrototypeFactoryPantofi.getPrototipPantof(EStilPantof.POP);

        try {
            APantof pantof3 = (APantof) pantofClient.clone();
            System.out.println(pantof3);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(pantof2);



    }
}