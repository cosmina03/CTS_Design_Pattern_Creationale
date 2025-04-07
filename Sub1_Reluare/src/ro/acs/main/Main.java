package ro.acs.main;

import ro.acs.clase.Candelabru;
import ro.acs.clase.Magazin;
import ro.acs.clase.MagazinBuilder;
import ro.acs.clase.Masa;

public class Main {
    public static void main(String[] args) {
        MagazinBuilder builder=new MagazinBuilder();
        Magazin magazin1= builder.setNrIntrari(9).addDecoratiune(new Candelabru()).build("H&M",700);
        System.out.println(magazin1);

    }
}