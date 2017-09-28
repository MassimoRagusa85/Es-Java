package mobilita;


public class Aliante extends Veicolo {
	
	public Aliante() {
		super();
		this.tipoTrazione = new TrazioneNaturale();
		aggiungiAmbiente(Ambiente.ARIA);
		((TrazioneNaturale)this.tipoTrazione).tipiTrazione = Trazioni.NATURALE;
	}

}
