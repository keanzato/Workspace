package cl.keanzato.app.AppIngenieriaSoftware.ConexionBD;

public class ConexionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6839762695786030573L;

	/**
	 * @param arg0
	 * @param arg1
	 */
	public ConexionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public ConexionException(String arg0) {
		super(arg0);
	}
	
	
}
