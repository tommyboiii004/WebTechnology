import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class db extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Connection conn = null;
        Statement stmt = null;
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            // create a database connection using jdbc , port no used here is 3306
            // database name is college and username is root , there is no password
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/financeapp", "root", "");
            stmt = conn.createStatement();
            PreparedStatement pstmt = conn.prepareStatement("insert into questions values(?, ?, ?)");
            pstmt.setString(1, request.getParameter("fName"));
            // Same for second parameter
            pstmt.setString(2, request.getParameter("email"));
            pstmt.setString(3, request.getParameter("question"));

            // pstmt.setInt(3, Integer.valueOf(request.getParameter("depnos")));
            // Execute the insert command using executeUpdate()
            // to make changes in database
            pstmt.executeUpdate();
            out.println("<html><body><p> Database Updated</p>");
            // select data from table where dept matches the value given by user in form
            String sql = "SELECT * FROM questions";
            pstmt = conn.prepareStatement(sql);
            // pstmt.setString(1, department);
            ResultSet rs = pstmt.executeQuery();
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                String fname = rs.getString("fullname");
                String email = rs.getString("email");
                String question = rs.getString("question");

                // Display values
                out.println("<p> FullName: " + fname + "<br>");
                out.println("e-mail: " + email + "<br>");
                out.println("Query: " + question + "<br></p>");
            }
            out.println("</body></html>");
            // Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.print("Do not connect to DB - Error:" + e);
        }
    }
}