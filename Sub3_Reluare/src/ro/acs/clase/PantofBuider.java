package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class PantofBuider implements IBuilder{
    protected ETipPantof tipPantof;
    protected int nrPantof;
    protected float dimensiuneToc;
    protected ETipMaterial material;
    protected List<ETipMaterial> materialeSuplimentare=new ArrayList<>();
    protected List<String> listaMesajeText=new ArrayList<>();

    public PantofBuider() {
    }

    public PantofBuider setMaterialeSuplimentare(ETipMaterial material) {
        materialeSuplimentare.add(material);
        return this;
    }

    public PantofBuider setListaMesajeText(String mesajeText) {
       listaMesajeText.add(mesajeText);
        return this;
    }

    public void reset(){
        this.tipPantof=ETipPantof.BALERINI;
        this.nrPantof=35;
        this.dimensiuneToc=0.5f;
        this.material=ETipMaterial.PLASTIC;
        this.listaMesajeText=new ArrayList<>();
        this.materialeSuplimentare=new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PantofBuider{");
        sb.append("tipPantof=").append(tipPantof);
        sb.append(", nrPantof=").append(nrPantof);
        sb.append(", dimensiuneToc=").append(dimensiuneToc);
        sb.append(", material=").append(material);
        sb.append(", materialeSuplimentare=").append(materialeSuplimentare);
        sb.append(", listaMesajeText=").append(listaMesajeText);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Pantof build(ETipPantof tipPantof,int nrPantof,float dimensiuneToc,ETipMaterial material) {
        Pantof pantof=new Pantof(tipPantof,nrPantof,dimensiuneToc,material);
        if(nrPantof<35 && nrPantof>45){
            throw new ExceptiePantof("Nu e bine");
        }
        if(dimensiuneToc<0.05f && dimensiuneToc>12.5f){
            throw new ExceptiePantof("Nu e bine");
        }

        for(ETipMaterial materialAdaugat: materialeSuplimentare){
            pantof.addMaterial(materialAdaugat);
        }
        for(String mesaj : listaMesajeText){
            pantof.addMesaj(mesaj);
        }
        reset();
        return pantof;
    }
}
