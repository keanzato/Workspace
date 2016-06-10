package cl.curso.java.abstract_factory;


public class MsWindowWidgetFactory implements AbstractWidgetFactory{

	public Window createWindow() {
		
		return new MSWindow();
	}
}
