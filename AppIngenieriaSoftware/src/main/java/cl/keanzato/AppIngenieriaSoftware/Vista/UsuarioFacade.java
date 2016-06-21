package cl.keanzato.AppIngenieriaSoftware.Vista;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import cl.keanzato.app.AppIngenieriaSoftware.ConexionBD.CuentaBloqueadaException;
import cl.keanzato.app.AppIngenieriaSoftware.DAO.UsuarioDAO;
import cl.keanzato.app.AppIngenieriaSoftware.Encapsulamiento.Usuario;



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
