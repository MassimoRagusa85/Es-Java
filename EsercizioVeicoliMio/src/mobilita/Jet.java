package mobilita;

public class Jet extends Veicolo {

	public Jet() {
		super();
		this.tipoTrazione = new TrazioneAMotore();
		aggiungiAmbiente(Ambiente.ARIA);
		((TrazioneAMotore)this.tipoTrazione).tipiTrazione = Trazioni.MOTORE;
	}

	
}
