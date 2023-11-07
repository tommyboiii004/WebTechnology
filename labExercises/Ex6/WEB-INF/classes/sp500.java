import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class sp500 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String data = "The S&P 500 Index is a stock market index that measures the performance of 500 large publicly traded companies in the United States .<br> It is widely regarded as the best single gauge of large-cap U.S. equities and covers approximately 80% of available market capitalization .<br> The index has gained 13.11% year-to-date and 58.75% over the past five years .";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='styles.css' /> <title>S&P 500</title></head>");

        out.println(
                "<body style=\"display: flex; justify-content: center; align-items: center; height: 100vh; flex-direction: column;\"><h1>About S&P 500: </h1><br><h2>"
                        + data + "</h2>");
        out.println("</body></html>");
    }
}