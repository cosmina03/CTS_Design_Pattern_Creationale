package clase;

public class PodeaLemn implements IPodea{
    @Override
    public float getDuritate() {
        return 5;
    }

    @Override
    public void curata() {
        System.out.println("Se curata podeaua de lemn");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PodeaLemn{");
        sb.append('}');
        return sb.toString();
    }
}
