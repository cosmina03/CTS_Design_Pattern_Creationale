package ro.acs.clase;

public class Masa implements IDecoratiuni{
    private ETipMaterial material;
    @Override
    public void curata() {
        System.out.println("La spalat");
    }

    @Override
    public ETipMaterial getMaterial() {
        return this.material;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("material=").append(material);
        sb.append('}');
        return sb.toString();
    }
}
