package cl.curso.java.singleton_app;

public class Motor {

	private static Motor _motor;
	
	
	private Motor()
	{
		
	}
	
	public static Motor getInstance()
	{
		if(null == _motor)
		{
			Motor motor = new Motor();
			_motor = motor;
		}
		return _motor;
	}
}
