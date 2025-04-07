package ro.acs.clase;

public class SupaLegume extends FelMancare{
    private int cantitate;
    public SupaLegume(float pret, int nrCalorii, int cantitate) {
        super(pret, nrCalorii);
        this.cantitate=cantitate;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append("cantitate=").append(cantitate);
        sb.append(", pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
