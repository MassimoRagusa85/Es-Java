package mobilita;

public class Chiatta extends Veicolo {

	public Chiatta() {
		super();
		this.tipoTrazione = new TrazioneAnimale();
		((TrazioneAnimale)this.tipoTrazione).specieAnimale = "Cavallo";
		aggiungiAmbiente(Ambiente.ACQUA);
	}

	
}
