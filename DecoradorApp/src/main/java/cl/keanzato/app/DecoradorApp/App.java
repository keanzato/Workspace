package cl.keanzato.app.DecoradorApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PizzaMasaTradicional tradicional = new PizzaMasaTradicional();
    	PizzaDecorador decorador = new PizzaEspañola();
    	decorador.setPizza(tradicional);
    }
}
