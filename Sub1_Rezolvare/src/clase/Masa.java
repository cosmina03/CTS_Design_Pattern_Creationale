package clase;

public class Masa implements IDecoratiuni {

    ETipMaterial eTipMaterial;

    public Masa(ETipMaterial eTipMaterial) {
        this.eTipMaterial = eTipMaterial;
    }

    @Override
    public void curata() {
    }

    @Override
    public ETipMaterial getMaterial() {
        return eTipMaterial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("eTipMaterial=").append(eTipMaterial);
        sb.append('}');
        return sb.toString();
    }
}
