package cl.curso.java.prueba_tres.CompositeApp;

public class LineaSeparadora extends Menu {

	
	/**
	 * 
	 */
	public LineaSeparadora() {
		super();
	}

	/**
	 * @param nombre
	 */
	public LineaSeparadora(String nombre, Comand comando) {
		super(nombre, comando);
	}

	@Override
	public void pintarMenu() {
		System.out.println("____________________");

	}

}
