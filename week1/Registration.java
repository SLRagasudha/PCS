import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Registration extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
                response.setContentType("text/html");
		PrintWriter out=response.getWriter();
                System.out.print("eeeeeeeeeeeee");
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
                
		String fname=request.getParameter("name");
                System.out.print(fname);
		String lname=request.getParameter("last");
		String email=request.getParameter("email");
                String password=request.getParameter("password");
                String retypepassword=request.getParameter("repassword");
                String secretquestion=request.getParameter("question");
                String answer=request.getParameter("answer");
                String gender=request.getParameter("gender");
                String use="use PCS";
                String instquery="insert into registration values('"+fname+"','"+lname+"','"+gender+"','"+email+"','"+password+"','"+retypepassword+"','"+secretquestion+"','"+answer+"')";
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			stmt=con.createStatement();
                        stmt.executeUpdate(use);
			stmt.executeUpdate(instquery);
                       //System.out.println(result+"rows inserted");
                        
                            response.sendRedirect("./index.html");
                        
                    } catch (Exception ex)
                    {
                        System.out.println(ex);
                         response.sendRedirect("./Registration.jsp");
                    }
        }
}
