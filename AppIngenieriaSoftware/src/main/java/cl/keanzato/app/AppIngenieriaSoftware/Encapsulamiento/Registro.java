package cl.keanzato.app.AppIngenieriaSoftware.Encapsulamiento;

import java.util.Date;

public class Registro {

	private int id_registro;
	private Date dia_atraso;
	private Date hora_atraso;
	private String rut_alumno;
	private String nombres_alumno;
	private String apellidos_alumno;
	private int numero_lista;
	
	/**
	 * 
	 */
	public Registro() {
	}
	
	/**
	 * @param id_registro
	 * @param dia_atraso
	 * @param hora_atraso
	 * @param rut_alumno
	 * @param nombres_alumno
	 * @param apellidos_alumno
	 * @param numero_lista
	 */
	public Registro(int id_registro, Date dia_atraso, Date hora_atraso,
			String rut_alumno, String nombres_alumno, String apellidos_alumno,
			int numero_lista) {
		this.id_registro = id_registro;
		this.dia_atraso = dia_atraso;
		this.hora_atraso = hora_atraso;
		this.rut_alumno = rut_alumno;
		this.nombres_alumno = nombres_alumno;
		this.apellidos_alumno = apellidos_alumno;
		this.numero_lista = numero_lista;
	}
	/**
	 * @return the id_registro
	 */
	public int getId_registro() {
		return id_registro;
	}
	/**
	 * @param id_registro the id_registro to set
	 */
	public void setId_registro(int id_registro) {
		this.id_registro = id_registro;
	}
	/**
	 * @return the dia_atraso
	 */
	public Date getDia_atraso() {
		return dia_atraso;
	}
	/**
	 * @param dia_atraso the dia_atraso to set
	 */
	public void setDia_atraso(Date dia_atraso) {
		this.dia_atraso = dia_atraso;
	}
	/**
	 * @return the hora_atraso
	 */
	public Date getHora_atraso() {
		return hora_atraso;
	}
	/**
	 * @param hora_atraso the hora_atraso to set
	 */
	public void setHora_atraso(Date hora_atraso) {
		this.hora_atraso = hora_atraso;
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
	
	
}
