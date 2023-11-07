import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class hidden extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Call us</title>");
            out.println("</head>");
            out.println("<body>");

            String userName = request.getParameter("CuserName");
            String phNumber = request.getParameter("CphNumber");

            out.print("<h1>Welcome to the Call us Page " + userName + "</h1>");
            out.print("<h2>Your phone number is " + phNumber + "</h2>");

            out.print("<br><h3>If your details are correct, Click on the next page to Call us.</h3>");
            // creating form that have invisible textfield
            out.print("<form action='hidden2' method='POST'>");
            out.print("<input type='hidden' name='uname' value='" + userName + "'>");
            out.print("<input type='submit' value='Call us'>");
            out.print("</form>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}