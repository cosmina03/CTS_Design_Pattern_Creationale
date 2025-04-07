package ro.acs.clase;

import ro.acs.clase.ETipMaterial;
import ro.acs.clase.ETipPantof;

import java.util.ArrayList;
import java.util.List;

public abstract class APantof {
	protected ETipPantof tipPantof;
	protected int nrPantof;
	protected float dimensiuneToc;
	protected ETipMaterial material;
	protected List<ETipMaterial> materialeSuplimentare;
	protected List<String> listaMesajeText;
	
	public abstract float calculPret();
	public abstract void addMesaj(String mesaj);
	public abstract void addMaterial(ETipMaterial tipMaterial);

	public APantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material ) {
		this.tipPantof = tipPantof;
		this.nrPantof = nrPantof;
		this.dimensiuneToc = dimensiuneToc;
		this.material = material;
		this.materialeSuplimentare = new ArrayList<>();
		this.listaMesajeText = new ArrayList<>();
	}
}
