package cl.keanzato.app.compareto;

import java.awt.color.CMMException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Empresa {

	private String nombre;
	private List<Empleado> empleados;
	
	
	/**
	 * 
	 */
	public Empresa() {
	}
	/**
	 * @param nombre
	 * @param empleados
	 */
	public Empresa(String nombre, List<Empleado> empleados) {
		this.nombre = nombre;
		this.empleados = empleados;
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
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void ordenarEmpleadosPorNombre()
	{
		Collections.sort(this.getEmpleados(), new Comparator<Empleado>() {
			
			public int compare(Empleado arg0, Empleado arg1) {
				return arg0.getNombre().compareTo(arg1.getNombre());
			}
		});
	}
	
	public void ordenarEmpleadosPorDepartamento()
	{
		Collections.sort(this.getEmpleados(), new Comparator<Empleado>() {
			
			public int compare(Empleado arg0, Empleado arg1) {
				return arg0.getDepto().compareTo(arg1.getDepto());
			}
		});
	}
	
	public Empleado buscarEmpleado(String rut)
	{	
		for (Empleado item : this.getEmpleados()) {
			if(item.getRut().equals(rut))
			{
				return item;
			}
			else
			{
				throw new EmpleadoException("Empleado no encontrado.");
			
			}
		}
		return null;
	}
	
	public void imprimir()
	{
		Iterator<Empleado> it = this.getEmpleados().iterator();
		while(it.hasNext())
			System.out.println(it.next().toString());
	}
	
	
}
