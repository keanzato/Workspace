package cl.keanzato.app.builder;

public class Director {

	private BuilderAuto builder;
	
	
	/**
	 * 
	 */
	public Director() {
	}


	/**
	 * @param builder
	 */
	public Director(BuilderAuto builder) {
		this.builder = builder;
	}


	/**
	 * @return the builder
	 */
	public BuilderAuto getBuilder() {
		return builder;
	}


	/**
	 * @param builder the builder to set
	 */
	public void setBuilder(BuilderAuto builder) {
		this.builder = builder;
	}


	public Auto construirAuto()
	{
		return builder.construir();
		
	}
}
