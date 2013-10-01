/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ragasudha
 */
public class Search extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        try { 
          
            PrintWriter out = response.getWriter();
              out.println("<html>");
      out.println("<body>");
             Connection conn = null;
            String url = "jdbc:mysql://localhost:3306/";;
             String dbName = "PCS";
            String driver = "com.mysql.jdbc.Driver";
            String username = "root"; 
            String userPassword = "root";
            String path="";
            String des="";
            String path1="";
            String path2="";
            String search=request.getParameter("search");
            System.out.println("abc:"+ search);
            PrintWriter out1 = response.getWriter();
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,username,userPassword);
            Statement stmt = conn.createStatement();
            ResultSet rs1;
            rs1 = stmt.executeQuery("SELECT videopath,description FROM video where keyword='"+search+"'");
       while(rs1.next())
				   {
                    path=rs1.getString("videopath");
                    des=rs1.getString("description");
				   }
        //out.println("videopath:"+path);
      
         path1="images/";
         path2=path1+path;
         //out.println("\n"+path2);
         //out.println("<a href='"+path2+"'>video</a>");
           //out.println("videopath:"+path2);
          //response.sendRedirect("./homepage.html");
           out.println("<video width=\"320\" height=\"240\" controls>");
           out.println(" <source src="+path2+" type=\"video/mp4\"></video>");
           out.println("</body>");
           out.println("</html>");
       //    out.println("<source src=\"images/'"+path+"'\" type=\"video/mp4\">");
           //out.println("description:"+des);/
        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

   
}
