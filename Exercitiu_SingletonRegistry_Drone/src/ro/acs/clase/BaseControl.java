package ro.acs.clase;

public class BaseControl implements IServiceConnection{
    private String locatie;
    BaseControl(){
        locatie="Bucuresti";
    }
    @Override
    public void connect(){
        System.out.println("Drona s-a conectat la "+this.locatie);

    }

}
