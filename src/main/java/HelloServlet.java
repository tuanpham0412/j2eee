import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello") // đường dẫn truy cập: http://localhost:8080/yourproject/hello
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Thiết lập kiểu phản hồi là HTML
        response.setContentType("text/html");

        // Ghi dữ liệu phản hồi
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Họ tên của tôi là: Nguyễn Văn A</h1>");
        out.println("</body></html>");
    }
}
