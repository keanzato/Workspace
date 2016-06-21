package cl.keanzato.app.DecoradorApp;

public abstract class PizzaDecorador implements Pizza {

	private Pizza pizza;
	
	
	/**
	 * 
	 */
	public PizzaDecorador() {
	}


	/**
	 * @param pizza
	 */
	public PizzaDecorador(Pizza pizza) {
		this.pizza = pizza;
	}


	/**
	 * @return the pizza
	 */
	public Pizza getPizza() {
		return pizza;
	}


	/**
	 * @param pizza the pizza to set
	 */
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}


	public void cocinarPizza() {
		// TODO Auto-generated method stub
		
	}

}
