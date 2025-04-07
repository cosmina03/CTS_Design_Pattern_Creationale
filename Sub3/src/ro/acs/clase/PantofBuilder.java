package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class PantofBuilder implements IBuilder{
    protected ETipPantof tipPantof;
    protected int nrPantof;
    protected float dimensiuneToc;
    protected ETipMaterial material;
    protected List<ETipMaterial> materialeSuplimentare=new ArrayList<>();
    protected List<String> listaMesajeText=new ArrayList<>();

    public PantofBuilder(ETipPantof tipPantof,int nrPantof,float dimensiuneToc, ETipMaterial material){
        this.tipPantof=tipPantof;
        this.nrPantof=nrPantof;
        this.dimensiuneToc=dimensiuneToc;
        this.material=material;
    }

    public PantofBuilder addMaterialSuplimentar(ETipMaterial materialSuplimentar){
        materialeSuplimentare.add(materialSuplimentar);
        return this;
    }
    public PantofBuilder addMesajSuplimentar(String mesajPantof){
        listaMesajeText.add(mesajPantof);
        return this;
    }
    public PantofBuilder reset(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.material = material;
        this.materialeSuplimentare = new ArrayList<>();
        this.listaMesajeText = new ArrayList<>();
        return this;
    }


    @Override
    public Pantof build() {
        if(nrPantof<35 || nrPantof>45){
            throw new ExceptiePantof("Numarul nu este corespunzator fabrici");
        }
        if(dimensiuneToc<0.5f || dimensiuneToc>12.5f){
            throw new ExceptiePantof("Dimensiunea tocului este necorespunzatoare");
        }

        Pantof pantof=new Pantof(tipPantof,nrPantof,dimensiuneToc,material);
        for(ETipMaterial material: materialeSuplimentare){
            pantof.addMaterial(material);
        }
        for(String mesaje :listaMesajeText){
            pantof.addMesaj(mesaje);
        }
        return pantof;
    }
}
