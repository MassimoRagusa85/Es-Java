package mobilita;

public class Bicicletta extends Veicolo {

	public Bicicletta() {
		super();
		this.tipoTrazione = new TrazioneAnimale();
		((TrazioneAnimale)this.tipoTrazione).tipiTrazione = Trazioni.UOMO;
		
		aggiungiAmbiente(Ambiente.TERRA);
	}

	
}
