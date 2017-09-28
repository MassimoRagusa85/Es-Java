package mobilita;

public class Skateboard extends Veicolo {

	public Skateboard() {
		super();
		this.tipoTrazione = new TrazioneAMotore();
		aggiungiAmbiente(Ambiente.TERRA);
	}
	

}
