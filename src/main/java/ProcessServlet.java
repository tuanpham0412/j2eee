import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet("/process")
public class ProcessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String hoten = request.getParameter("hoten");
        String email = request.getParameter("email");
        String gioitinh = request.getParameter("gioitinh");
        String[] sothich = request.getParameterValues("sothich");

        out.println("<h2>Thông tin bạn đã nhập:</h2>");
        out.println("Họ tên: " + hoten + "<br>");
        out.println("Email: " + email + "<br>");
        out.println("Giới tính: " + gioitinh + "<br>");
        out.println("Sở thích: ");

        if (sothich != null) {
            for (String st : sothich) {
                out.print(st + " ");
            }
        } else {
            out.print("Không có");
        }
    }
}
