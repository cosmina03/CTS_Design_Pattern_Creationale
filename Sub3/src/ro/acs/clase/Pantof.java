package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class Pantof extends APantof{
    Pantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        super(tipPantof, nrPantof, dimensiuneToc, material);
        this.listaMesajeText=new ArrayList<>();
        this.materialeSuplimentare=new ArrayList<>();
    }

    @Override
    public float calculPret() {
        float pret=100;
        if(this.material==ETipMaterial.PIELE){
            pret=pret*2;
        }
        for(ETipMaterial material : materialeSuplimentare){
            pret+=20;
        }
        return pret;
    }

    @Override
    public void addMesaj(String mesaj) {
        int lungimeMesaj=mesaj.length();
        for(String m: listaMesajeText){
            lungimeMesaj+=m.length();
        }
        if(lungimeMesaj>nrPantof){
            throw new ExceptiePantofiMesaje("Lungimea mesajelor depaseste numarul de la pantof");
        }
        this.listaMesajeText.add(mesaj);
    }

    @Override
    public void addMaterial(ETipMaterial tipMaterial) throws ExceptieMaterialeSuplimentare{
        if(materialeSuplimentare.size()>2 && ETipPantof.BALERINI==tipPantof){
            throw new ExceptieMaterialeSuplimentare("Nu se pot adauga atat de multe materiale pe piele ");
        }else if (materialeSuplimentare.size()>5 && tipPantof==ETipPantof.STILETTO){
            throw new ExceptieMaterialeSuplimentare("S-a atins limita maxima pentru pantofi STILETTO");
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
        sb.append(", materialeSuplimentare=").append(materialeSuplimentare);
        sb.append(", listaMesajeText=").append(listaMesajeText);
        sb.append('}');
        return sb.toString();
    }
}
