import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Learn extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");

            String indexName = request.getParameter("indexName");

            out.println(indexName);

            Cookie c = new Cookie("UserCookie", indexName);

            response.addCookie(c);

            out.print("<h2>You've Selected:</h2>" + indexName);

            out.print("<h3>A really good choice.</h3>");

            out.println("<br /> Kindly click the following link to know more about your selected index");

            out.print("<a href='cookieC2'>INBOX</a>");

            out.close();
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }
}