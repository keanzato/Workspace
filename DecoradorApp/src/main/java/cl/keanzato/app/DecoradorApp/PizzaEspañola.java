package cl.keanzato.app.DecoradorApp;

public class PizzaEspañola extends PizzaDecorador {

	public void cocinarPizza() {
		this.getPizza().cocinarPizza();
		
		System.out.println("Agregar Ingredientes pizzaa española");
	}

	
}

