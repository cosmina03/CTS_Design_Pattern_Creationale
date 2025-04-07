package ro.acs.fabrici;

import ro.acs.clase.Clatite;
import ro.acs.clase.FelMancare;
import ro.acs.clase.Papanas;

public class DesertFactory implements TipMancareFactory{
    private int cantitateZahar;

    public DesertFactory(int cantitateZahar) {
        this.cantitateZahar = cantitateZahar;
    }

    public void setCantitateZahar(int cantitateZahar) {
        this.cantitateZahar = cantitateZahar;
    }

    @Override
    public FelMancare prepareFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
        switch (tip){
            case Deserturi.Clatite -> {return new Clatite(pret,nrCalorii,this.cantitateZahar);
            }
            case Deserturi.Papanasi -> {return new Papanas(pret,nrCalorii,this.cantitateZahar);
            }
            default -> {return null;}
        }
    }
}
