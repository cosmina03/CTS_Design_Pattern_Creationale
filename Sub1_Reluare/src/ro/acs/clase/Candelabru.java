package ro.acs.clase;

public class Candelabru implements IDecoratiuni{
    private ETipMaterial material=ETipMaterial.STICLA;
    @Override
    public void curata() {
        System.out.println("Se curata rapid rapid rapid");

    }

    @Override
    public ETipMaterial getMaterial() {
        return this.material;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Candelabru{");
        sb.append("material=").append(material);
        sb.append('}');
        return sb.toString();
    }
}
