package mobilita;

public class TrazioneAMotore extends TipoTrazione {

	public String carburante;
	
	public TrazioneAMotore() {
		super();
	}

	@Override
	public void muovi() {
		System.out.println("accelera");
	}

	@Override
	public void arresta() {
		System.out.println("frena");
	}
	
}
