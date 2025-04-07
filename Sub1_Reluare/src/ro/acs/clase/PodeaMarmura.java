package ro.acs.clase;

public class PodeaMarmura implements IPodea{
    private float duritate=8;
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
        final StringBuilder sb = new StringBuilder("PodeaMarmura{");
        sb.append("duritate=").append(duritate);
        sb.append('}');
        return sb.toString();
    }
}
