package ro.acs.main;

import ro.acs.clase.Comanda;
import ro.acs.clase.Cuptor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cuptor cuptor=Cuptor.getInstance();
        cuptor.addComanda(new Comanda(30,"Pizza",180));
        cuptor.addComanda(new Comanda(60,"Frigarui",90));
        cuptor.addComanda(new Comanda(90,"papapa",50));
        Cuptor cuptor1=Cuptor.getInstance();
        cuptor1.addComanda(new Comanda(70,"adfgg",80 ));
        cuptor.afisareComenziAsteptare();

    }
}