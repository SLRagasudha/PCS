import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
        response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String user_name="";
		
		String uname=request.getParameter("username");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String query="select firstname from registration where firstname='"+uname+"' and password='"+pass+"'";
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PCS","root","root");
			stmt=con.createStatement();
                        rs=stmt.executeQuery(query);
                        
                        while(rs.next())
                        {
                                user_name=rs.getString(1);

                        }
                        if(user_name.equals(uname))
                        {
                                out.print("welcome"+user_name);
                                response.sendRedirect("./homepage.html");
                        }
                        else
                        {
                                ServletContext context= getServletContext();
                                RequestDispatcher rd= context.getRequestDispatcher("/warningindex.html");
                                rd.include(request, response);

                        }
			} catch (Exception ex)
			{
                                ServletContext context= getServletContext();
                                RequestDispatcher rd= context.getRequestDispatcher("/warningindex.html");
                                rd.include(request, response);
			}
        }
}
