

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SupportServlet
 */
@WebServlet("/SupportServlet")
public class SupportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");    
	     request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("UserName");
		String phone=request.getParameter("Phone");
		String mail=request.getParameter("Email");
		String msg=request.getParameter("Message");	
		response.getWriter().append("User Name: ").append(name+"<br>");
		response.getWriter().append("Phone: ").append(phone+"<br>");
		response.getWriter().append("Email: ").append(mail+"<br>");
		response.getWriter().append("Message: ").append(msg+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
