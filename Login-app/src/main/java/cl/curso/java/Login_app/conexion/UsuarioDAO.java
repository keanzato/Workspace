package cl.curso.java.Login_app.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cl.curso.java.Login_app.login.CuentaBloqueadaException;
import cl.curso.java.Login_app.login.Usuario;


/**
 * 
 * @author Kevin Zambrano
 *
 */
public class UsuarioDAO {

	public static boolean validar(Usuario usuario) throws SQLException
	{
		Conexion con = Conexion.getInstancia();
		PreparedStatement st = con.getConnection().prepareStatement(
				"select * from usuario where "+
				"nombre_usuario =? AND "+
				"password = ?;");
			st.setString(1,  usuario.getUsuario());
			st.setString(2,  usuario.getPassword());
			
			ResultSet rs = st.executeQuery();
			return rs.next();
	}
	
	public static void aumentarIntentos(Usuario usuario) throws CuentaBloqueadaException
	{
		usuario.setIntentosFallidos(usuario.getIntentosFallidos()+1);
		if (usuario.getIntentosFallidos() >= 3) {
			throw new CuentaBloqueadaException("La cuenta ha sido bloqueada");
		}
	}
}
