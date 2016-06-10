/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.curso.java.Login_app.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import cl.curso.java.Login_app.conexion.UsuarioDAO;
import cl.curso.java.Login_app.conexion.WebCamServices;



/**
 * @author Juan Maldonado León
 *
 */
public class Usuario {

	private String usuario;
	private String password;
	private int intentosFallidos;

	public Usuario() {
	}

	/**
	 * @param usuario
	 * @param password
	 * @param intentosFallidos
	 */
	public Usuario(String usuario, String password, int intentosFallidos) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.intentosFallidos = intentosFallidos;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the intentosFallidos
	 */
	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	/**
	 * @param intentosFallidos
	 *            the intentosFallidos to set
	 */
	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	/**
	 * 
	 * @throws AutenticacionException
	 * @throws CuentaBloqueadaException
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public void login() throws AutenticacionException, CuentaBloqueadaException, SQLException, IOException {
		

		if (this.getIntentosFallidos() >= 3) {
			throw new CuentaBloqueadaException("La cuenta ha sido bloqueada");
		}
		if (!(UsuarioDAO.validar(this))) {
			this.intentosFallidos++;
			
			
			WebCamServices.tomarFoto2(5);
			throw new AutenticacionException("Usuario y/o Pass incorrectos");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Entraste el sistema.");
		}

	}
}
