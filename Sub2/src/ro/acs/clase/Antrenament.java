package ro.acs.clase;

public class Antrenament implements IAntrenament{
    private String denumire;
    private int durata;

    @Override
    public String getAntrenament(int index) {
        return this.denumire;
    }

    @Override
    public void getTimpTotal() {
        System.out.println("Durata antrenament "+this.durata);

    }
}
