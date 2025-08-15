package Actions;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import com.deepsalunkhe.api.GreetLocal;

/**
 * Servlet implementation class GreetAction
 */
@WebServlet("/greet")
public class GreetAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	GreetLocal greet;
	
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String message = greet.greet(name); // Call your EJB

	    request.setAttribute("message", message);
	    request.getRequestDispatcher("Hello.jsp").forward(request, response);
		
	}

}
