package cl.keanzato.app.compareto;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Departamento depto = new Departamento("Los pehuenches", "Muy amplio");
        Departamento depto1 = new Departamento("Los Incas", "Muy Chico");
        
        Empleado emp = new Empleado("19188374-8", "Kevin", "Zambrano", 20, depto, 700000);
        Empleado emp1 = new Empleado("17765354-3", "Francisco", "Jaques", 25, depto1, 450000);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(emp);
        empleados.add(emp1);
        
        Empresa empresa = new Empresa("Keanzato", empleados);
        
        System.out.println(empresa.buscarEmpleado("19188374-8"));
        
    }
}
