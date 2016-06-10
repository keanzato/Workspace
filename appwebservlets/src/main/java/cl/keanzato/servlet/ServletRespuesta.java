package cl.keanzato.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRespuesta
 */
public class ServletRespuesta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRespuesta() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("respuesta.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = "keanzato";
		String password = "chupalo123";
		String respuesta = usuario;
		
		if(request.getParameter("txtUsuario").equals(usuario) && request.getParameter("txtPassword").equals(password))
		{
			request.setAttribute("respuesta", usuario);
			request.getRequestDispatcher("respuesta.jsp").forward(request, response);
			
		}
		else
		{
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
		
	}

}
