package ro.acs.clase;

public class Registrator extends AbstractPersonal{
    private int sporNonMedical;

    public Registrator(String nume, int vechime, int sporNonMedical) {
        super(nume, vechime);
        this.sporNonMedical = sporNonMedical;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Registrator{");
        sb.append("sporNonMedical=").append(sporNonMedical);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getNume() {
        return this.nume;
    }
}
