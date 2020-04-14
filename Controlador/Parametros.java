
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.security.MD5Encoder;

/**
 * Servlet implementation class Parametros
 */
@WebServlet("/Parametros")
public class Parametros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Parametros() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String codigo = request.getParameter("codigo");
		String cedula = request.getParameter("cedula");
		String nombre = request.getParameter("nombre");
		String fechaN = request.getParameter("fechaN");
		String fechaI = request.getParameter("fechaI");
		String fechaR = request.getParameter("fechaR");

		Empleado e = new Empleado();

		e.setCodigo(Integer.parseInt(codigo));
		e.setCedula(Integer.parseInt(cedula));
		e.setNombre(nombre);
		e.setFechaN(Date.valueOf(fechaN));
		e.setFechaI(Date.valueOf(fechaI));
		e.setFechaR(Date.valueOf(fechaR));

		EmpleadoDao eDao = new EmpleadoDao();

		if (eDao.registrar(e)) {

			String site = new String("http://localhost:8080/Nomina/index.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);

		} else {

			String site = new String("http://localhost:8080/Nomina/Registrar.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);

		}

	}

}
