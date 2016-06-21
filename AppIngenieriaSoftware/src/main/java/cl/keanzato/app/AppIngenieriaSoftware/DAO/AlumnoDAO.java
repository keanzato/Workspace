package cl.keanzato.app.AppIngenieriaSoftware.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.keanzato.app.AppIngenieriaSoftware.ConexionBD.ConexionBD;
import cl.keanzato.app.AppIngenieriaSoftware.Encapsulamiento.Alumno;

public class AlumnoDAO {

	private List<Alumno> alumnos;

	
	/**
	 * @return the alumnos
	 */
	public List<Alumno> getAlumnos() {
		return alumnos;
	}


	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}


	

	public List<Alumno> listar(Alumno alumno) throws SQLException
	{
		
			ConexionBD con = ConexionBD.getInstancia();
			PreparedStatement st = con.getConnection().prepareStatement("select * from alumno where rut_alumno = ?");
			st.setString(1, alumno.getRut_alumno());
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				for(Alumno item : this.getAlumnos())
				{
					item.setRut_alumno(rs.getString("rut_alumno"));
					item.setNombres_alumno(rs.getString("nombres_alumno"));
					item.setApellidos_alumno(rs.getString("apellidos_alumno"));
					item.setNumero_lista(rs.getInt("numero_lista"));
					
					this.getAlumnos().add(item);	
				}
				
			}		
		return this.getAlumnos();
	}


	public static ArrayList<Object[]> llenarTabla(){
		
		ConexionBD con = ConexionBD.getInstancia();
		ArrayList<Object[]> datos = new ArrayList<Object[]>();
	
		try {
			PreparedStatement st = con.getConnection().prepareStatement("select * from alumno");
			ResultSet rs = st.executeQuery(); 
			
			while(rs.next())
			{
				Object[] filas = new Object[4];
				for (int i = 0; i < filas.length; i++) {
						filas[i] =rs.getObject((i+1)); 
				}
				datos.add(filas);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return datos;
	}
	
}
