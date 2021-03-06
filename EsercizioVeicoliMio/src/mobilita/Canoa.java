package mobilita;

public class Canoa extends Veicolo {

	public Canoa() {
		super();
		this.tipoTrazione = new TrazioneAnimale();
		aggiungiAmbiente(Ambiente.ACQUA);
		((TrazioneAnimale)this.tipoTrazione).tipiTrazione = Trazioni.UOMO;
	}

	@Override
	public void muovi() {
		System.out.println("rema....");
	}

	@Override
	public void arresta() {
		System.out.println("rema al contrario...");
	}
	
}
