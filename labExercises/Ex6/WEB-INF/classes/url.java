import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class url extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Text us</title>");
            out.println("</head>");
            out.println("<body>");

            String userName = request.getParameter("TuserName");
            String phNumber = request.getParameter("TphNumber");

            out.print("<h1>Welcome to the Text us Page " + userName + "</h1>");
            out.print("<br><h2>Your phone number is " + phNumber + "</h2>");

            out.print("<h3>If your details are correct, Click on the next page to Text us.</h3>");

            // appending the username in the query string
            out.print("<a href='url2?uname=" + userName + "'>Text us</a>");

            out.println("</body>");
            out.println("</html>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}