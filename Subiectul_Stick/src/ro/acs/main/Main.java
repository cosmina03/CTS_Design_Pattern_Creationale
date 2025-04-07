package ro.acs.main;

import ro.acs.clase.Masina;
import ro.acs.clase.PrototypeSticker;
import ro.acs.clase.Sticker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Masina m1=new Masina("Skoda",2010);
        Masina m2=new Masina("Skoda",2015);
        System.out.println(m1.getCodUnic());

       try {
            Sticker sticker1 = PrototypeSticker.getPrototip("Skoda-2010");
            Sticker sticker2 = PrototypeSticker.getPrototip(m1.getCodUnic());
            Sticker sticker3 = PrototypeSticker.getPrototip(m2.getCodUnic());
            sticker2.setCuloare("Negru");
            System.out.println(sticker1);
            System.out.println(sticker2);
            System.out.println(sticker3);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}