package ro.acs.clase;

public abstract class ACuptor {
	
	public abstract int getGradeMaxime();
	
	//returneaza timpul de asteptare in functie de comenzile existente
	public abstract int getTimpAsteptare();
	
	//afiseaza comenzile in asteptare
	public abstract void afisareComenziAsteptare();
	
	//adauga o comanda noua in lista de comenzi aflate in asteptare

}
