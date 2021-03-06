package cl.keanzato.app.builder;

import java.util.ArrayList;

public class BuilderAutoTesla extends BuilderAuto {

	@Override
	public Auto construir() {
		
		Rueda rueda = new Rueda(20);
		Rueda rueda1 = new Rueda(25);
		Rueda rueda2 = new Rueda(30);
		GPS gps = new GPS("Android", "JillyBean");
		Motor motor = new Motor(5000);
		ArrayList<Rueda> ruedas = new ArrayList<Rueda>();
		ruedas.add(rueda);
		ruedas.add(rueda1);
		ruedas.add(rueda2);
		
		Auto autoToyota = new Auto("Toyota", "Supra", ruedas, gps, motor);
		
		return autoToyota;
	}
}
