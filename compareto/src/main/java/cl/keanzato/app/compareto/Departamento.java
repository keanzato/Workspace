package cl.keanzato.app.compareto;

public class Departamento implements Comparable<Departamento>{

	private String nombre;
	private String descripcion;
	
	/**
	 * 
	 */
	public Departamento() {
	}
	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Departamento(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Departamento)
		{
			Departamento depto = (Departamento)obj;
			return this.getNombre().equals(depto.getNombre());
		}
		return false;
	}
	
	public int compareTo(Departamento arg0) {
		return this.getNombre().compareTo(arg0.getNombre());
	}
	
	public String toString()
	{
		return "\nDepartamento"
			+"\nNombre: "+this.getNombre()
			+"\nDescripcion: "+this.getDescripcion(); 
	}
}
