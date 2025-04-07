package ro.acs.clase;

public class Bracardier extends AbstractPersonal{
    private int sporMedical;

    public Bracardier(String nume, int vechime, int sporMedical) {
        super(nume, vechime);
        this.sporMedical = sporMedical;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bracardier{");
        sb.append("sporMedical=").append(sporMedical);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
