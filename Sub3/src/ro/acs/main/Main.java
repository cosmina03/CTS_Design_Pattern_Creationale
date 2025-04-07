package ro.acs.main;

import ro.acs.clase.ETipMaterial;
import ro.acs.clase.ETipPantof;
import ro.acs.clase.Pantof;
import ro.acs.clase.PantofBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      PantofBuilder pantofBuilder=new PantofBuilder(ETipPantof.BALERINI,40,7, ETipMaterial.PLASTIC);
      try{
          Pantof pantof=pantofBuilder.build();
          System.out.println(pantof);
      }catch (Exception e){
          System.out.println(e.getMessage());
      }
      try{
            Pantof pantof2=pantofBuilder.reset(ETipPantof.GHETE,35,6,ETipMaterial.PIELE).addMaterialSuplimentar(ETipMaterial.PLASA).addMesajSuplimentar("Imi plac pantofi mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm").build();
          System.out.println(pantof2);
      }catch (Exception e){
            System.out.println(e.getMessage());
      }
      try{
            Pantof pantof3=pantofBuilder.reset(ETipPantof.STILETTO,40,6,ETipMaterial.PIELE).build();
          System.out.println(pantof3);
      }catch (Exception e){
            System.out.println(e.getMessage());
      }



    }
}