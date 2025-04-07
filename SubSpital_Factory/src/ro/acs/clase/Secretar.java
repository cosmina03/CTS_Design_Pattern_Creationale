package ro.acs.clase;

public class Secretar extends AbstractPersonal{
    private int sporNonMedical;

    public Secretar(String nume, int vechime, int sporNonMedical) {
        super(nume, vechime);
        this.sporNonMedical=sporNonMedical;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append("sporNonMedical=").append(sporNonMedical);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
