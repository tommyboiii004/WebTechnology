
/* TO RECEIVE COOKIES THAT IS ALREADY SET*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class nasdaq extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            PrintWriter out = response.getWriter();

            response.setContentType("text/html");
            String value = "";
            String data = "The Nasdaq Composite Index is a stock market index that includes almost all stocks listed on the Nasdaq stock exchange.<br> It is a broad index that is heavily weighted toward the important technology sector.<br> The index has gained 22.57% year-to-date and 89.67% over the past five years.";

            response.setContentType("text/html");
            out.println("<link rel='stylesheet' href='styles.css' /> <title>Nasdaq Composite Index</title></head>");

            out.println(
                    "<body style=\"display: flex; justify-content: center; align-items: center; height: 100vh; flex-direction: column;\">");

            out.println("<h3>About: </h3>");

            Cookie[] ck = request.getCookies();

            int len = ck.length;

            for (int i = 0; i < len; i++) {
                value = ck[i].getValue();
                out.println(value);
            }
            out.println(value);
            out.println("<h2>" + data + "</h2>");

            out.println("</body></html>");
            out.close();
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }
}