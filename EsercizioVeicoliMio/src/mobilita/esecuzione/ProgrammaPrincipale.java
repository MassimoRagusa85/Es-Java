package mobilita.esecuzione;

import mobilita.Aliante;
import mobilita.Automobile;
import mobilita.Bicicletta;
import mobilita.Carrozza;
import mobilita.Veicolo;

public class ProgrammaPrincipale {

	public static void main(String[] args) {
		Veicolo v = new Bicicletta();
		Veicolo v1 = new Carrozza();
		Veicolo v2 = new Aliante();
		// queste sono le istruzioni che voglio 
		// impedire di eseguire
		//c.tipoTrazione.trazioneAnimale = false;
		//c.getTipoTrazione().trazioneAnimale = false;
		
		System.out.printf("Il veicolo %s si muove %s ed è mosso %s", v.getClass().getSimpleName(), v.getAmbiente(), v.getTipoTrazione());
		System.out.println();
		System.out.printf("Il veicolo %s si muove %s ed è mosso %s", v1.getClass().getSimpleName(), v1.getAmbiente(), v1.getTipoTrazione());
		System.out.println();
		System.out.printf("Il veicolo %s si muove %s ed è mosso %s", v2.getClass().getSimpleName(), v2.getAmbiente(), v2.getTipoTrazione());
		System.out.println();

	}

}
