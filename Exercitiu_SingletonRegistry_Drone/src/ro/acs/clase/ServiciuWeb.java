package ro.acs.clase;

public class ServiciuWeb implements IServiceConnection {
    private String numeServiciu;
    ServiciuWeb(){
      this.numeServiciu="Serviciu1";
    }

    public void connect(){
        System.out.println("Drona s-a conectat la "+this.numeServiciu);
    }

}
