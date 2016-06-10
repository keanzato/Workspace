package cl.curso.java.Login_app.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private static Conexion _conexion;
	private Connection connection;
	
	/**
	 * 
	 */
	private Conexion()
	{
		
	}
	
	public static Conexion getInstancia()
	{
		if(_conexion == null)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conne = DriverManager.getConnection(
						"jdbc:mysql://192.168.0.128:3306/curso",
						"alumnos",
						"java123");
				
				Conexion conexion = new Conexion();
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