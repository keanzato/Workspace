package cl.keanzato.app.AppIngenieriaSoftware.ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

	private static ConexionBD _conexion;
	private Connection connection;
	
	/**
	 * 
	 */
	private ConexionBD()
	{
		
	}
	
	public static ConexionBD getInstancia()
	{
		if(_conexion == null)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conne = DriverManager.getConnection(
						"jdbc:mysql://localhost/atrasos",
						"root",
						"");
				
				ConexionBD conexion = new ConexionBD();
				conexion.setConnection(conne);
				_conexion = conexion;
			} catch (Exception e) {
				throw new  ConexionException("Ocurrio un error"
						+" al conectar con la base de datos", e);
			}
		}
		return _conexion;
		
	}

	/**
	 * @return the _conexion
	 */
	public static ConexionBD get_conexion() {
		return _conexion;
	}

	/**
	 * @param _conexion the _conexion to set
	 */
	public static void set_conexion(ConexionBD _conexion) {
		ConexionBD._conexion = _conexion;
	}

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	
}