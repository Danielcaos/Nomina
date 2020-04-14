

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Busqueda
 */
@WebServlet("/Busqueda")
public class Busqueda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Busqueda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Empleado e = new Empleado();
		e.setCodigo(Integer.parseInt((String)request.getParameter("codigo")));
		
		
		EmpleadoDao nominaDAO = new EmpleadoDao();
		e = nominaDAO.buscar(e);
		
		request.setAttribute("codigo", e.getCodigo());
		request.setAttribute("cedula", e.getCedula());
		request.setAttribute("nombre", e.getNombre());
		request.setAttribute("fechaN", e.getFechaN());
		request.setAttribute("fechaI", e.getFechaI());
		request.setAttribute("fechaR", e.getFechaR());
	
		
	    RequestDispatcher rd;
		rd = request.getRequestDispatcher("/Resultado.jsp");
		rd.forward(request, response);
	}

}
