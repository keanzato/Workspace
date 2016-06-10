package cl.keanzato.app.builder;

import java.util.List;

public class Auto {

	private String marca;
	private String modelo;
	private List<Rueda> ruedas;
	private GPS gps;
	private Motor motor;
	
	/**
	 * 
	 */
	public Auto() {
	}
	/**
	 * @param marca
	 * @param modelo
	 * @param ruedas
	 * @param gps
	 * @param motor
	 */
	public Auto(String marca, String modelo, List<Rueda> ruedas, GPS gps,
			Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.ruedas = ruedas;
		this.gps = gps;
		this.motor = motor;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the ruedas
	 */
	public List<Rueda> getRuedas() {
		return ruedas;
	}
	/**
	 * @param ruedas the ruedas to set
	 */
	public void setRuedas(List<Rueda> ruedas) {
		this.ruedas = ruedas;
	}
	/**
	 * @return the gps
	 */
	public GPS getGps() {
		return gps;
	}
	/**
	 * @param gps the gps to set
	 */
	public void setGps(GPS gps) {
		this.gps = gps;
	}
	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
}
