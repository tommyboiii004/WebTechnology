import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class sessionId extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mail us</title>");
            out.println("</head>");
            out.println("<body>");

            String userName = request.getParameter("EuserName");
            String phNumber = request.getParameter("EphNumber");

            out.print("<h1>Welcome to the Mail us Page " + userName + "</h1>");
            out.print("<h2>Your phone number is " + phNumber + "</h2>");

            out.print("<br><h3>If your details are correct, Click on the next page to Mail us.</h3>");

            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            out.print("<a href='sessionId2'>Mail us</a>");

            out.println("</body>");
            out.println("</html>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}