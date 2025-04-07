package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class Imprimanta extends AImprimanta{

    private int nivelToner;
    private boolean isColor;
    private int IP;
    //private static Imprimanta instance=null;
    private Imprimanta(int nivelToner, boolean isColor, int IP){
        this.nivelToner=nivelToner;
        this.isColor=isColor;
        this.IP=IP;
    }
    private static Map<Integer,Imprimanta> registry=new HashMap<>();

    static{
        Imprimanta imprimanta1=new Imprimanta(100,false,1);
        Imprimanta imprimanta2=new Imprimanta(100,true,2);
        Imprimanta imprimanta3=new Imprimanta(100,true,3);
        registry.put(imprimanta1.getIP(),imprimanta1);
        registry.put(imprimanta2.getIP(),imprimanta2);
        registry.put(imprimanta3.getIP(), imprimanta3);
    }

    public static Map<Integer, Imprimanta> registry() {
        return registry;
    }

    public static Imprimanta getInstanceImprimanta(int id){
        return registry.get(id);
    }

    @Override
    public int getNivelToner() {
        return this.nivelToner;
    }

    @Override
    public boolean isColor() {
        return this.isColor;
    }

    @Override
    public int getIP() {
        return this.IP;
    }

    public static void printeaza(IDocument document, int paginaStart,int paginaFinal, TipPrintare tip){
        int nrPaginiPrintate=paginaFinal-paginaStart;
        int tonerNecesar=(nrPaginiPrintate/10)*5;
        boolean printat=false;
        for(Imprimanta i : registry.values()){
            if(i.isColor== true  && TipPrintare.COLOR==tip){
                if(2*tonerNecesar<i.nivelToner){
                    i.nivelToner=i.nivelToner-tonerNecesar*2;
                    System.out.println("Documentul a fost printat de imprimanta"+ i.getIP()+ " iar nivelul de toner este "+i.nivelToner);
                    printat=true;
                    return;
                }
            } else if(TipPrintare.ALBNEGRU==tip){
                if(tonerNecesar<i.nivelToner){
                    i.nivelToner=i.nivelToner-tonerNecesar;
                    System.out.println("Documentul a fost printat de imprimanta"+ i.getIP()+ " iar nivelul de toner este "+i.nivelToner);
                   printat=true;
                    return;
                }
            }
        }
        if(printat==false){
            throw new ExceptiePrintare("Nu s a reusit printarea");
        }
    }
    public static void afisareTonerDisponibil(){
        for(Imprimanta i : registry.values()){
            System.out.println(i.IP+ " are toner disponibil  "+ i.nivelToner);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imprimanta{");
        sb.append("nivelToner=").append(nivelToner);
        sb.append(", isColor=").append(isColor);
        sb.append(", IP=").append(IP);
        sb.append('}');
        return sb.toString();
    }
}
