package cl.curso.java.abstract_factory;

public class GUIBuilder {

	public Window buildWindow(AbstractWidgetFactory factory)
	{
		return factory.createWindow();
	}
}
