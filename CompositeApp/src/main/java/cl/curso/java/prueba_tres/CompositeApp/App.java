package cl.curso.java.prueba_tres.CompositeApp;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SubMenu menuNew = new SubMenu("New", new ArrayList<Menu>(), new ComandoNulo());
    	menuNew.getMenus().add(new ItemMenu("Java Project", "", new CrearProyectoJava()));
    	menuNew.getMenus().add(new ItemMenu("Project...", "", new Comand() {
			
			public void ejecutar() {
				System.out.println("Se creara un proyecto...");
			}
		}));
    
    	
    	
        SubMenu menu = new SubMenu("File", new ArrayList<Menu>());
        menu.getMenus().add(menuNew);
        menu.getMenus().add( new ItemMenu("Open File", "alt gr+2"));
        menu.getMenus().add( new LineaSeparadora(null));
        menu.getMenus().add( new ItemMenu("Close", "alt+f4"));
        menu.getMenus().add( new ItemMenu("Window", "ctrl+shift"));
        menu.pintarMenu();
        
        menu.getMenus().get(2).onClick();
    }
}
