package ro.acs.clase;

public class RaportAlertare implements FieldReport{
    RaportAlertare() {
    }

    @Override
    public void emiteRaport() {
        System.out.println("Drona a emis un raport "+ this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raport Alertare");

        return sb.toString();
    }
}
