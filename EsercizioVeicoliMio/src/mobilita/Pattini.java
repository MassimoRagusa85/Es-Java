package mobilita;

public class Pattini extends Veicolo {

	public Pattini() {
		super();
		this.tipoTrazione = new TrazioneAnimale();
		((TrazioneAnimale)this.tipoTrazione).specieAnimale = "Uomo";
		aggiungiAmbiente(Ambiente.TERRA);
	}
	

}
