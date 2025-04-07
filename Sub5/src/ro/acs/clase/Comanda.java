package ro.acs.clase;

public class Comanda {
	private int timpGatire;
	private String denumirePreparat;
	private int gradeGatire;
	
	public Comanda(int timpGatire, String denumirePreparat, int gradeGatire) {
		super();
		this.timpGatire = timpGatire;
		this.denumirePreparat = denumirePreparat;
		this.gradeGatire=gradeGatire;
	}

	public int getTimpGatire() {
		return timpGatire;
	}

	public String getDenumirePreparat() {
		return denumirePreparat;
	}

	public int getGradeGatire() {
		return gradeGatire;
	}

	@Override
	public String toString() {
		return "Comanda [timpGatire=" + timpGatire + ", denumirePreparat=" + denumirePreparat + ", gradeGatire="
				+ gradeGatire + "]";
	}
	
	
}
