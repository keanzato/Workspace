package cl.curso.java.Login_app.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import cl.curso.java.Login_app.conexion.UsuarioDAO;
import cl.curso.java.Login_app.conexion.WebCamServices;

public final class UsuarioFacade {

	
	/**
	 * 
	 * @throws AutenticacionException
	 * @throws CuentaBloqueadaException
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public static void login(Usuario usuario) throws AutenticacionException, CuentaBloqueadaException, SQLException, IOException {
		

		
		if (!(UsuarioDAO.validar(usuario))) {
			UsuarioDAO.aumentarIntentos(usuario);
			
			
			WebCamServices.tomarFoto2(5);
			throw new AutenticacionException("Usuario y/o Pass incorrectos");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Entraste el sistema.");
		}

	}
}
