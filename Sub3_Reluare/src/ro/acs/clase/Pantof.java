package ro.acs.clase;

import java.util.ArrayList;

public class Pantof extends APantof{
    public Pantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        super(tipPantof, nrPantof, dimensiuneToc, material);
        this.materialeSuplimentare=new ArrayList<>();
        this.listaMesajeText=new ArrayList<>();
    }

    @Override
    public float calculPret() {
        float pret=50;
        if(this.nrPantof>42){
            pret+=15;
        }
        if(this.material==ETipMaterial.PIELE){
            pret+=100;
        }else if(this.material==ETipMaterial.TEXTIL){
            pret+=25;
        }else{
            pret+=10;
        }
        if(this.dimensiuneToc>10){
            pret+=40;
        }
        return pret;

    }

    @Override
    public void addMesaj(String mesaj) {
        int dimensiuneLista=0;
        for(String mesaje : listaMesajeText){
            dimensiuneLista+=mesaje.length();
        }
        dimensiuneLista+=mesaj.length();
        if(dimensiuneLista>this.nrPantof){
            throw new ExceptieTextPantof("Nu se poate");
        }
        listaMesajeText.add(mesaj);

    }

    @Override
    public void addMaterial(ETipMaterial tipMaterial) {
        if(this.tipPantof==ETipPantof.BALERINI && materialeSuplimentare.size()>2){
            throw new ExceptieMaterialPantof("Nu e corect");
        }
        if(this.tipPantof==ETipPantof.GHETE && materialeSuplimentare.size()>5){
            throw new ExceptieMaterialPantof("NU e bine");
        }
        materialeSuplimentare.add(tipMaterial);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pantof{");
        sb.append("tipPantof=").append(tipPantof);
        sb.append(", nrPantof=").append(nrPantof);
        sb.append(", dimensiuneToc=").append(dimensiuneToc);
        sb.append(", material=").append(material);
        sb.append(", listaMesajeText=").append(listaMesajeText);
        sb.append(", materialeSuplimentare=").append(materialeSuplimentare);
        sb.append('}');
        return sb.toString();
    }
}
