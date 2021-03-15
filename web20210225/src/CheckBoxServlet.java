

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckBoxServlet
 */
@WebServlet("/CheckBoxServlet")
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBoxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8"); 
		String c1=request.getParameter("color1");
		String c2=request.getParameter("color2");
		String c3=request.getParameter("color3");
		if(c1 !=null) {
			response.getWriter().append("Color1: ").append(c1+"<br>");
		}else {
			response.getWriter().append("Color1: ").append("null<br>");
		}
		if(c2 !=null) {
			response.getWriter().append("Color2: ").append(c2+"<br>");
		}else {
			response.getWriter().append("Color2: ").append("null<br>");
		}
		if(c3 !=null) {
			response.getWriter().append("Color3: ").append(c3);
		}else {
			response.getWriter().append("Color3: ").append("null<br>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
