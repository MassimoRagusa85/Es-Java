package mobilita;

import java.util.ArrayList;
import java.util.List;
import java.util.spi.TimeZoneNameProvider;

public abstract class Veicolo implements Spostabile {
	
	public int pesoInKg;
	public int velocitaMassima;
	
	protected TipoTrazione tipoTrazione;
	List<Ambiente> ambientiDiFunzionamento;
	List<Trazioni> trazioni;
	
	public Veicolo() {
		super();
		this.ambientiDiFunzionamento = new ArrayList<>();
		this.trazioni = new ArrayList<>();
	}

	public void aggiungiAmbiente(Ambiente e) {
		
		if (this.ambientiDiFunzionamento.size() < 2) {
			this.ambientiDiFunzionamento.add(e);
		}
		else {
			System.out.println("Troppi ambienti inseriti");
		}
	}
	public String getAmbiente() {
		return ambientiDiFunzionamento.get(0).toString();
	}
	
	public String getTipoTrazione() {
		
		return tipoTrazione.tipiTrazione.toString();
		//return trazioni.get(0).toString();
		}
	

	@Override
	public void muovi() {
		tipoTrazione.muovi();
	}

	@Override
	public void arresta() {
		tipoTrazione.arresta();
	}
	
	
}
