import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class evaluvate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String answer1 = request.getParameter("q1");
        String answer2 = request.getParameter("q2");

        String correctAnswer1 = "4";
        String correctAnswer2 = "1";

        int score = 0;
        if (answer1.equalsIgnoreCase(correctAnswer1)) {
            score += 50;
        }
        if (answer2.equalsIgnoreCase(correctAnswer2)) {
            score += 50;
        }

        // // Store the score in the session for display
        HttpSession session = request.getSession();
        session.setAttribute("score", score);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='styles.css' /> <title>Result</title></head>");

        out.println(
                "<body style=\"display: flex; justify-content: center; align-items: center; height: 100vh; flex-direction: column;\"><h1>Your Result is: </h1><br><h2>Your Score: "
                        + score + "</h2>");
        out.println("</body></html>");
    }
}