package main;
import clase.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MagazinBuilder magazinBuilder=new MagazinBuilder("Zara",500,6);
        try {
            Magazin magazin = magazinBuilder.setListaDecoratiuni(new Masa(ETipMaterial.LEMN)).setListaDecoratiuni(new Candelabru(ETipMaterial.STICLA)).setPodea(new PodeaLemn()).build();
            Magazin magazin2 = magazinBuilder.reset("H&M", 100, 2).setListaDecoratiuni(new Masa(ETipMaterial.LEMN)).setListaDecoratiuni(new Candelabru(ETipMaterial.STICLA)).build();
            magazin.descriere();
            magazin2.descriere();
            Magazin magazin3 = magazinBuilder.reset("Primark", 900, 6).setPodea(new PodeaLemn()).build();

            magazin3.descriere();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}