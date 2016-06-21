package cl.curso.java.prueba_tres.CompositeApp;

public abstract class Menu {

	private String nombre;
	private Comand comando = new ComandoNulo();
	
	/**
	 * 
	 */
	public Menu() {
	}

	/**
	 * @param nombre
	 */
	public Menu(String nombre, Comand comando) {
		this.nombre = nombre;
		this.comando = comando;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void pintarMenu();
	
	public void onClick()
	{
		this.comando.ejecutar();
	}
}