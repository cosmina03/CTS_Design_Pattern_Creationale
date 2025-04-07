package clase;

public class Candelabru implements IDecoratiuni {
    private ETipMaterial material;

    public Candelabru(ETipMaterial material) {
        this.material = material;
    }

    @Override
    public void curata() {
        System.out.println("Se curata candelabrul");
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
