package mobilita;

public class Pattini extends Veicolo {

	public Pattini() {
		super();
		this.tipoTrazione = new TrazioneAnimale();
		((TrazioneAnimale)this.tipoTrazione).tipiTrazione = Trazioni.UOMO;
		aggiungiAmbiente(Ambiente.TERRA);
	}
	

}
