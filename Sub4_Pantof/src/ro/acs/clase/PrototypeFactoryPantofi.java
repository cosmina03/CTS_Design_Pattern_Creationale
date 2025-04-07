package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactoryPantofi {
    private static Map<EStilPantof, APantof> prototipuriPantofi=new HashMap<>();

    static{
        System.out.println("Crearea cate unui pantof ce apoi va fi personalizat");
        APantof pantofPop=new PantofPop(36,"Rosu",ETipPantof.BALERINI);
        prototipuriPantofi.put(EStilPantof.POP,pantofPop);
        APantof pantotRock=new PantofRock(36,"Rosu",ETipPantof.BALERINI);
        prototipuriPantofi.put(EStilPantof.ROCK,pantotRock);
        APantof pantofPunk=new PantofPunk(36,"Rosu",ETipPantof.BALERINI);
        prototipuriPantofi.put(EStilPantof.PUNK,pantofPunk);
    }

    public static APantof getPrototipPantof(EStilPantof stil){
       if(prototipuriPantofi.containsKey(stil)){
           try {
               return (APantof) prototipuriPantofi.get(stil).clone();
           } catch (CloneNotSupportedException e) {
               e.printStackTrace();
           }
       }
       return null;
    }


}
