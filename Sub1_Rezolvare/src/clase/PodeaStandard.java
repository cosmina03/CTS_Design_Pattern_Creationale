package clase;

public class PodeaStandard implements IPodea {
    @Override
    public float getDuritate() {
        return 1;
    }

    @Override
    public void curata() {
        System.out.println("Se curata podeaua standard");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PodeaStandard{");
        sb.append('}');
        return sb.toString();
    }
}
