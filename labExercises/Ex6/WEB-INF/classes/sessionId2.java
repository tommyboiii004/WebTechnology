import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class sessionId2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String n = request.getParameter("userName");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Call us</title>");
            out.println("</head>");
            out.println("<body>");

            // Getting the value from the hidden field
            out.print("<h2>Hello " + n + " </h2>");
            out.println("<h3>Your refrence number is: 123456</h3>");
            out.println("<h1>Mail us at this e-mail: financeapp@mail.com</h1>");

            out.println("</body>");
            out.println("</html>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}