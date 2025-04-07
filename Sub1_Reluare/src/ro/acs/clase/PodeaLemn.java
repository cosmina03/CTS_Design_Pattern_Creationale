package ro.acs.clase;

public class PodeaLemn implements IPodea{
    private float duritate=6;
    @Override
    public float getDuritate() {
        return duritate;
    }

    @Override
    public void curata() {
        System.out.println("Podea "+this.getClass()+ "este curatata");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PodeaLemn{");
        sb.append("duritate=").append(duritate);
        sb.append('}');
        return sb.toString();
    }
}
