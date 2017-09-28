package mobilita;

public class Yacht extends Veicolo{

	public Yacht() {
		super();
		this.tipoTrazione = new TrazioneAMotore();
		aggiungiAmbiente(Ambiente.ACQUA);
		((TrazioneAMotore)this.tipoTrazione).tipiTrazione = Trazioni.MOTORE;
	}
	

}
