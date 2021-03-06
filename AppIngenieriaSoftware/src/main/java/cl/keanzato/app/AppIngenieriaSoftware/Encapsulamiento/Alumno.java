package cl.keanzato.app.AppIngenieriaSoftware.Encapsulamiento;

public class Alumno {

	private String rut_alumno;
	private String nombres_alumno;
	private String apellidos_alumno;
	private int numero_lista;
	
	
	
	/**
	 * 
	 */
	public Alumno() {
	}
	/**
	 * @param rut_alumno
	 * @param nombres_alumno
	 * @param apellidos_alumno
	 * @param numero_lista
	 */
	public Alumno(String rut_alumno, String nombres_alumno,
			String apellidos_alumno, int numero_lista) {
		this.rut_alumno = rut_alumno;
		this.nombres_alumno = nombres_alumno;
		this.apellidos_alumno = apellidos_alumno;
		this.numero_lista = numero_lista;
	}
	/**
	 * @return the rut_alumno
	 */
	public String getRut_alumno() {
		return rut_alumno;
	}
	/**
	 * @param rut_alumno the rut_alumno to set
	 */
	public void setRut_alumno(String rut_alumno) {
		this.rut_alumno = rut_alumno;
	}
	/**
	 * @return the nombres_alumno
	 */
	public String getNombres_alumno() {
		return nombres_alumno;
	}
	/**
	 * @param nombres_alumno the nombres_alumno to set
	 */
	public void setNombres_alumno(String nombres_alumno) {
		this.nombres_alumno = nombres_alumno;
	}
	/**
	 * @return the apellidos_alumno
	 */
	public String getApellidos_alumno() {
		return apellidos_alumno;
	}
	/**
	 * @param apellidos_alumno the apellidos_alumno to set
	 */
	public void setApellidos_alumno(String apellidos_alumno) {
		this.apellidos_alumno = apellidos_alumno;
	}
	/**
	 * @return the numero_lista
	 */
	public int getNumero_lista() {
		return numero_lista;
	}
	/**
	 * @param numero_lista the numero_lista to set
	 */
	public void setNumero_lista(int numero_lista) {
		this.numero_lista = numero_lista;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Alumno)
		{
			Alumno alumno = (Alumno) arg0;
			return this.getRut_alumno().equals(alumno.getRut_alumno());
		}
		return false;
	}
}
