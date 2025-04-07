package ro.acs.clase;

public class Masina implements IMasina{
    private String model;
    private int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModelMasina() {
        return this.model;
    }

    @Override
    public int getAnFabricatie() {
        return this.anFabricatie;
    }

    public String getCodUnic(){
        return this.model+"-"+this.anFabricatie;
    }


//    public Masina(String model, int anFabricatie) {
//        this.model = model;
//        this.anFabricatie = anFabricatie;
//    }
//
//    @Override
//    public String getModelMasina() {
//        return this.model;
//    }
//
//    @Override
//    public int getAnFabricatie() {
//        return this.anFabricatie;
//    }
//
//    public String getCodUnic(){
//        return this.model+"-"+this.anFabricatie;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Masina{");
//        sb.append("model='").append(model).append('\'');
//        sb.append(", anFabricatie=").append(anFabricatie);
//        sb.append('}');
//        return sb.toString();
//    }
}
