package ro.acs.clase;

public class RaportAvertizare implements FieldReport{
     RaportAvertizare() {
    }

    @Override
    public void emiteRaport() {
        System.out.println("Drona emite un raport "+ this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raport Avertizare");

        return sb.toString();
    }
}
