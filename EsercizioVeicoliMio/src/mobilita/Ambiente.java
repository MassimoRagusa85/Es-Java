package mobilita;

public enum Ambiente {
	
	ARIA ("in aria"),
	ACQUA ("in acqua"),
	TERRA ("a terra"),
	SPAZIO ("Spazio"),
	SOTTOSUOLO ("Sottosuolo"),
	SOTTACQUA ("Sottacqua");

	private String tipo;
	private Ambiente(String tipo) {
		this.tipo = tipo;
	}
	public String toString(){
		return tipo;
		
	}
}
