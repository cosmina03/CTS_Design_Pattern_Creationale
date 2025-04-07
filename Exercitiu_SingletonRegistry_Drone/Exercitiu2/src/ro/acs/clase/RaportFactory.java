package ro.acs.clase;

public class RaportFactory {

    public static FieldReport getRaport(TipRaport tip){
        switch (tip){
            case INFORMARE -> {return new RaportInformare();}
            case ALERTARE -> {return new RaportAlertare();}
            case AVERTIZARE -> {return new RaportAvertizare();}
            default -> {throw new RuntimeException("Nu s-a dat un tip corespunzator");}
        }
    }
}
