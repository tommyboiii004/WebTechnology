import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Learn extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String indexName = request.getParameter("indexName");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Learn about a Index</title>");
            out.println("</head>");
            out.println("<body>");

            out.print("<h2>You've Selected: " + indexName + "</h2>");
            out.print("<h3>A really good choice.</h3>");

            out.println("Kindly click the following link to know more about your selected index");

            if ((indexName.equals("S&P 500"))) {
                out.print("<a href='sp500'>S&P 500</a>");
            } else {
                out.print("<a href='nasdaq'>NASDAQ Composite Index</a>");
            }
            Cookie cookie = new Cookie("selectedIndex", indexName);
            response.addCookie(cookie);
            out.println("</body>");
            out.println("</html>");
            out.close();

        } catch (Exception exp) {
            System.out.println(exp);
        }
    }
}