package ro.acs.clase;

public class Asistent extends AbstractPersonal{
    private int sporPersonalMedical;

    public Asistent(String nume, int vechime, int sporPersonalMedical) {
        super(nume, vechime);
        this.sporPersonalMedical = sporPersonalMedical;
    }


    @Override
    public String getNume() {
        return super.nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("sporPersonalMedical=").append(sporPersonalMedical);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
