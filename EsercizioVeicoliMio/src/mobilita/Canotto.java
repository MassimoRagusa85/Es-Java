package mobilita;

public class Canotto extends Veicolo {

	public Canotto() {
		super();
		this.tipoTrazione = new TrazioneAnimale();
		((TrazioneAnimale)this.tipoTrazione).tipiTrazione = Trazioni.UOMO;
		aggiungiAmbiente(Ambiente.ACQUA);
	}

		

}
