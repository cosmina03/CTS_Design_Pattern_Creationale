package ro.acs.main;

import ro.acs.clase.ETipMaterial;
import ro.acs.clase.ETipPantof;
import ro.acs.clase.Pantof;
import ro.acs.clase.PantofBuider;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PantofBuider pantofBuider=new PantofBuider();
        Pantof pantof=pantofBuider.setListaMesajeText("Alex&Cosmina").setMaterialeSuplimentare(ETipMaterial.PLASTIC).setMaterialeSuplimentare(ETipMaterial.TEXTIL).build(ETipPantof.STILETTO,36,1, ETipMaterial.PIELE);
        System.out.println(pantof);
        System.out.println(pantof.calculPret());
    }
}