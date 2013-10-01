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
public class Search2 extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("<html>");
     out.println("<head>");
 out.println("<title>Searching video</title>");
out.println("<link href='default.css' rel='stylesheet' type='text/css' media='screen' />");
 out.println("</head>");
 out.println("<body>");
out.println("<div id='header'>");
out.println("<div id='logo'>");
out.println("<h1><span>Predictable</span>ConvergentSolutions</h1>");
           out.println("</div>");	
	 out.println("<div id='menu'>");	
		out.println("<ul>");
			out.println("<li><a href='index.html'>Home</a></li>");
			out.println("<li><a href='#'>About us</a></li>");
			out.println("<li><a href='Registration.jsp'>Registration</a></li>");
			out.println("<li><a href='Login.html'>Login</a></li>");
			out.println("<li><a href='#'>Contact us</a></li>");
		out.println("</ul>");
	out.println("</div>");	
out.println("</div>");
	out.println("<div id='page'>");
		out.println("<div id='sidebar1' class='sidebar'>");
			out.println("<ul>");
			out.println("<li>");	
					out.println("<h2>Categories</h2>");
                                        out.println("</li>");
				out.println("<li>");	
					out.println("<h2>Recently Viewed Videos</h2>");
				 out.println("</li>");
				out.println("<li>");
                                    out.println("<h2>");
                                        out.println("<form>");
                                            out.println("<input type='button' value='like'></input>");
                                         out.println("</form>");
                                         out.println("</h2>"); 
                                 out.println("</li>");
				out.println("<li>");
                                   out.println("<h2>");
                                       out.println("<form>");
                                            out.println("<input type='button' value='dislike'></input>");
                                    out.println("</form>");
                                         out.println("</h2>"); 
                                 out.println("</li>");
			out.println("</ul>");
		out.println("</div>");
		out.println("<div id='content'>");
			out.println("<div class='padding1'>");
                            out.println("<h1>MP4 Format video</h1>");
                             try{
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
         out.println("<video width=\"320\" height=\"240\" controls>");
         out.println(" <source src="+path2+" type=\"video/mp4\"></video>");
                            //<video width="320" height="240" controls>
                            //<source src="images/Cognizant.mp4" type="video/mp4"></video><br><br>
                             //<form action="./addvalues" method="post" enctype="multipart/form-data" name="productForm" id="productForm"><br><br>
                                //name: <INPUT type="text" name="name"/><br/>
                                //description: <input  type="text" name="des"/><br/>
                              //Select file: <input type="file" name="file"/>
                                //<input type="submit" value="Upload">   
                            //</form>
                            //<h1>Webm Format video</h1>
                            //<video width="320" height="240" controls>
                            //<source src="images/UMLHD 720p.webmhd.webm" type="video/webm"></video><br><br>
                            
			 out.println("</div>");
                            out.println("<div class='post'>");
				out.println("<h1 class='title'>Welcome to Our Website!</h1>");
				out.println("<div class='entry'>");
				out.println("<p>This Website provides you video based training on the technologies required to do any project.</p>");
				 out.println("</div>");
                                  out.println("</div>");
                                  out.println("</div>");
		
		out.print("<div id=\"sidebar2\" class=\"sidebar\">");
				out.println("<li>");
					out.println("<form id='searchform' method='post' action='./Search2'>");
						out.println("<div>");
							out.println("<h2>Search Video</h2>");
							out.println("<input type=\"text\" name=\"search\" id=\"search\" size=\"15\" value=\"\" />");
                                                        out.println("<input type=\"submit\" value=\"Search\"></td>&nbsp;<br><br>");
                                              out.println("</div>");
					 out.println("</form>");
				  out.println("</li>");
			out.println("<ul>");
		  out.println("</div>");
		
		out.println("<div style=\"clear: both;\">&nbsp;</div>");
	out.println("</div>");

out.println("<div id='footer'>");
	out.println("<p class=\"copyright\">&copy;&nbsp;&nbsp;2013 All Rights Reserved &nbsp;&bull;&nbsp; Design by MSIT JNTU</p>");
out.println("</div>");
out.println("<div align=center>");
out.println("</div>");
out.println("</body>");
           out.println("</html>"); 
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
