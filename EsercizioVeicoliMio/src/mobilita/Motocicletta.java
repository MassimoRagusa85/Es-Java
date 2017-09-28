package mobilita;

public class Motocicletta extends Veicolo {

	public Motocicletta() {
		super();
		this.tipoTrazione = new TrazioneAMotore();
		aggiungiAmbiente(Ambiente.TERRA);
		((TrazioneAMotore)this.tipoTrazione).tipiTrazione = Trazioni.MOTORE;
	}

	
}
