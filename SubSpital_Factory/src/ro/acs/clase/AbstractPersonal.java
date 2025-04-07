package ro.acs.clase;

public abstract class AbstractPersonal {
    protected String nume;
    protected int vechime;

    public AbstractPersonal(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }

    public abstract String getNume();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractPersonal{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
