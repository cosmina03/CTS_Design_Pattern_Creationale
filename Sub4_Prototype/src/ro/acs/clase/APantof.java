package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class APantof implements Cloneable{
	protected ETipPantof tipPantof;
	protected EStilPantof stilPantof;
	protected List<String> listaMesaje;
	protected int marimePantof;
	protected String culoare;

	public void setMarimePantof(int marimePantof) {
		this.marimePantof = marimePantof;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public void setTipPantof(ETipPantof tipPantof) {
		this.tipPantof = tipPantof;
	}

	//adauga un nou mesaj text care o sa fie inscriptionat pe pantof
	public abstract void addMesaj(String mesaj);
	
	//calculeaza pretul folosind o formula ce utilizeaza tipPantof, 
	//listaMesaje si marimePantof
	public abstract void calculeazaPret();

	@Override
	public Object clone() throws CloneNotSupportedException {
		APantof pantof= (APantof) super.clone();
		pantof.tipPantof=this.tipPantof;
		pantof.stilPantof=this.stilPantof;
		pantof.marimePantof=this.marimePantof;
		pantof.culoare=this.culoare;
		pantof.listaMesaje=new ArrayList<>(this.listaMesaje);
		return pantof;
	}
}
