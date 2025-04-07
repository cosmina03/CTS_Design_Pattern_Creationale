package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeSticker {
    private static Map<String,ASticker> listaPrototipuri=new HashMap<>();

    static {
        Masina m=new Masina("Skoda",2010);
        Sticker sticker=new Sticker(m,80);
        listaPrototipuri.put(m.getCodUnic(),sticker);

        Masina m2=new Masina("Skoda",2011);
        Sticker sticker2=new Sticker(m,80);
        listaPrototipuri.put(m2.getCodUnic(),sticker2);

        Masina m3=new Masina("Skoda",2015);
        Sticker sticker3=new Sticker(m,80);
        listaPrototipuri.put(m.getCodUnic(),sticker);

    }
    public static Sticker getPrototip(String cheie) throws CloneNotSupportedException {
        Sticker clona= (Sticker) listaPrototipuri.get(cheie);
        if(clona!=null){
            return (Sticker) clona.clone();
        }
        return null;
    }

}
