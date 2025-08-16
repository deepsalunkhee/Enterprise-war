package Actions;

import java.io.IOException;

import com.deepsalunkhe.api.GreetLocal;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetAction
 */
@WebServlet("/greet")
public class GreetAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	GreetLocal greet;
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Hello.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String message = greet.greet(name);

		request.setAttribute("message", message);
		request.getRequestDispatcher("Hello.jsp").forward(request, response);

	}

}
