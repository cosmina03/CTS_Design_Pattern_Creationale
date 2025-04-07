package ro.acs.clase;

public class RaportInformare implements FieldReport{
     RaportInformare() {
    }

    @Override
    public void emiteRaport() {
        System.out.println("Drona emite un raport "+this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raport Informare");

        return sb.toString();
    }
}
