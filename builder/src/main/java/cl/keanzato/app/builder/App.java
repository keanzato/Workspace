package cl.keanzato.app.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Director director = new Director();
        
        
        director.setBuilder(new BuilderAutoToyota());
        
    }
}
