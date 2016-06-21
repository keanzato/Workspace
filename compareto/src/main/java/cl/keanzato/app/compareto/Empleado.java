package cl.keanzato.app.compareto;

public class Empleado extends Persona {

	private Departamento depto;
	private int salario;
	
	
	/**
	 * 
	 */
	public Empleado() {
		super();
	}
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Empleado(String rut, String nombre, String apellido, int edad, Departamento depto, int salario) {
		super(rut, nombre, apellido, edad);
		this.depto = depto;
		this.salario = salario;
	}
	/**
	 * @return the depto
	 */
	public Departamento getDepto() {
		return depto;
	}
	/**
	 * @param depto the depto to set
	 */
	public void setDepto(Departamento depto) {
		this.depto = depto;
	}
	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Empleado)
		{
			Empleado emp = (Empleado)obj;
			return this.getRut().equals(emp.getRut());
		}
		return false;
	}
	
	public String toString()
	{
		return "\nEmpleado"
			+"\nRut: "+this.getRut()
			+"\nNombre: "+this.getNombre()
			+"\nApellido: "+this.getApellido()
			+"\nEdad: "+this.getEdad()
			+"\nSalario: "+this.getSalario()
			+"\n"+this.getDepto().toString();
	}
}
