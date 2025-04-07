import ro.acs.clase.Comanda;
import ro.acs.clase.Cuptor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Comanda c=new Comanda(10,"alalal",101);
        Comanda c1=new Comanda(55,"alalaaaal",50);
        Comanda c2=new Comanda(66,"aaa",222);
        Comanda c3=new Comanda(33,"alaaaaalal",201);
        Comanda c4=new Comanda(44,"alaaaaalal1",44);

        Cuptor.addComanda(c);
        Cuptor.addComanda(c1);
        Cuptor.addComanda(c2);
        Cuptor.addComanda(c3);
        Cuptor.addComanda(c4);
       // Cuptor.addComanda(c5);
        Cuptor.afisareComenzi();

    }
}