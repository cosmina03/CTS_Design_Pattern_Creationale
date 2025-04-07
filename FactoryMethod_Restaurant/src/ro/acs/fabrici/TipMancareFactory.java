package ro.acs.fabrici;

import ro.acs.clase.FelMancare;

public interface TipMancareFactory {
    FelMancare prepareFelMancare(TipFelMancare tip, float pret, int nrCalorii);
}
