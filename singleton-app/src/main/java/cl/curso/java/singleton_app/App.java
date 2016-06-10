package cl.curso.java.singleton_app;

public class App {

	public static void main(String[] args) {
		Motor motor1 = Motor.getInstance();
		Motor motor2 = Motor.getInstance();
		Motor motor3 = Motor.getInstance();
		Motor motor4 = Motor.getInstance();
	}
}
