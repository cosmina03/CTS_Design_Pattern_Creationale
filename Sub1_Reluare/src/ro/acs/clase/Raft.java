package ro.acs.clase;

public class Raft implements IDecoratiuni{
    private ETipMaterial material;
    @Override
    public void curata() {
        System.out.println("Curata rapid rapid");
    }

    @Override
    public ETipMaterial getMaterial() {
        return this.material;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raft{");
        sb.append("material=").append(material);
        sb.append('}');
        return sb.toString();
    }
}
