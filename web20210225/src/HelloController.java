import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.HelloModel;
@WebServlet(name="HelloController", urlPatterns={"/hello.do"})
public class HelloController extends HttpServlet {
    private HelloModel hello = new HelloModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("user");
        String message = hello.sayHello(name);
        request.setAttribute("message", message);
        request.getRequestDispatcher("helloView.jsp").forward(request, response);
    }
}
