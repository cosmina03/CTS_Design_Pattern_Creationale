package ro.acs.clase;

public class PodeaStandard implements IPodea{
    private float duritate=7;

    @Override
    public float getDuritate() {
        return this.duritate;
    }

    @Override
    public void curata() {
        System.out.println("Podea "+this.getClass()+ "este curatata");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PodeaStandard{");
        sb.append("duritate=").append(duritate);
        sb.append('}');
        return sb.toString();
    }
}
