package cl.curso.java.prueba_tres.CompositeApp;

import java.util.List;

public class SubMenu extends Menu {

	private List<Menu> menus;
	
	
	/**
	 * 
	 */
	public SubMenu() {
		super();
	}

	/**
	 * @param nombre
	 */
	public SubMenu(String nombre, List<Menu> menus, Comand comando) {
		super(nombre, comando);
		this.menus = menus;
	}

	/**
	 * @return the menus
	 */
	public List<Menu> getMenus() {
		return menus;
	}

	/**
	 * @param menus the menus to set
	 */
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public void pintarMenu() {
		System.out.println( this.getNombre() );
		for( Menu menu : this.getMenus() )
		{
				menu.pintarMenu();
		}
	}
	
	
}
