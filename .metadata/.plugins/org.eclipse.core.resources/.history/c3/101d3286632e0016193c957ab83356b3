package cl.curso.java.abstract_factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String platform = System.getProperty("os.name").toLowerCase();
    	
    	System.out.println(platform);
    	GUIBuilder builder = new GUIBuilder();
    	if(platform.startsWith("win"))
    	{
    		builder.buildWindow(new MsWindowWidgetFactory());
    	}
    	else
    	{
    		builder.buildWindow(new MacOSXWidgetFactory());
    	}
    }
}
