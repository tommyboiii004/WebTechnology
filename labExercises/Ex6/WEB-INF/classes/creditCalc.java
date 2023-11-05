
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class creditCalc extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter output = response.getWriter();

        int cScore = Integer.parseInt(request.getParameter("creditScore"));

        if (cScore < 580) {
            output.println("Your Credit Score is Poor, try improving it.");
        } else if (cScore < 669) {
            output.println("Your Credit Score is Fair, try improving it.");
        } else if (cScore < 739) {
            output.println("Your Credit Score is Good, try improving it a little.");
        } else if (cScore < 799) {
            output.println("Your Credit Score is Very Good. Investing now is the right time.");
        } else {
            output.println("Your Credit Score is Exceptional. Just Invest.");
        }

    }
}
