package ro.acs.clase;

public class SatelitGPS implements IServiceConnection{
    private String satelit;

     SatelitGPS() {
        this.satelit = "Satelit-1";
    }
    public void connect(){
        System.out.println("Drona este conectata "+this.satelit);
    }
}
