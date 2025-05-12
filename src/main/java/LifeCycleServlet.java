
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("LifeCycleServlet: init() được gọi");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        System.out.println("LifeCycleServlet: doGet() được gọi");

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("Đây là LifeCycleServlet. Kiểm tra console để thấy các phương thức được gọi.");
    }

    @Override
    public void destroy() {
        System.out.println("LifeCycleServlet: destroy() được gọi");
    }
}
