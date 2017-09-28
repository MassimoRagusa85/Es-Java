package mobilita;

public class Canotto extends Veicolo {

	public Canotto() {
		super();
		this.tipoTrazione = new TrazioneAnimale();
		((TrazioneAnimale)this.tipoTrazione).specieAnimale = "Uomo";
		aggiungiAmbiente(Ambiente.ACQUA);
	}

		

}
