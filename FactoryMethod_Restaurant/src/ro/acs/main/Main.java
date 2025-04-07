package ro.acs.main;

import ro.acs.clase.FelMancare;
import ro.acs.fabrici.SupaFactory;
import ro.acs.fabrici.Supe;
import ro.acs.fabrici.TipMancareFactory;

public class Main {
    public static void main(String[] args) {
        TipMancareFactory factorySupe=new SupaFactory(400);
        FelMancare supa1=factorySupe.prepareFelMancare(Supe.SupaCiuperci,60,400);
        FelMancare supa2=factorySupe.prepareFelMancare(Supe.SupaLegume,7,800);
        System.out.println(supa1.toString());


    }


}
