package cl.keanzato.app.AdapterApp;

/**
 * @author gonza
 *
 */
public class GuitarraElectricaAcustica implements Guitarra {
	
	public GuitarraAcustica guitarraAcustica;

	public void encender() {
		guitarraAcustica.tocar();
		
	}

	public void apagar() {
		guitarraAcustica.dejarDeToca();
		
	}

	public GuitarraAcustica getGuitarraAcustica() {
		return guitarraAcustica;
	}

	public void setGuitarraAcustica(GuitarraAcustica guitarraAcustica) {
		this.guitarraAcustica = guitarraAcustica;
	}
	
	

}
