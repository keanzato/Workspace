package cl.keanzato.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.keanzato.app.bean.BeanPersona;

/**
 * Servlet implementation class ServletSalida
 */
public class ServletSalida extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSalida() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BeanPersona beanPersona = new BeanPersona();
		
		beanPersona.setNombre(request.getParameter("txtNombre"));
		beanPersona.setApellidoPaterno(request.getParameter("txtApellidoPaterno"));
		beanPersona.setApellidoMaterno(request.getParameter("txtApellidoMaterno"));
		beanPersona.setRut(request.getParameter("txtRut"));
		
		request.setAttribute("beanPersona", beanPersona);
		request.getRequestDispatcher("salida.jsp").forward(request, response);
		
	}

}
