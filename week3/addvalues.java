/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Ragasudha
 */
public class addvalues extends HttpServlet {

   
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
PrintWriter out = response.getWriter();
boolean isMultipart = ServletFileUpload.isMultipartContent(request);
System.out.println("request: "+request);
if (!isMultipart) {
System.out.println("File Not Uploaded");
} else {
FileItemFactory factory = new DiskFileItemFactory();
ServletFileUpload upload = new ServletFileUpload(factory);
List items = null;


        try {
            items = upload.parseRequest(request);
        } catch (FileUploadException ex) {
            Logger.getLogger(addvalues.class.getName()).log(Level.SEVERE, null, ex);
        }
String name="";
String des="";
Iterator itr = items.iterator();
while (itr.hasNext()) {
FileItem item = (FileItem) itr.next();
if (item.isFormField()){
String name1 = item.getFieldName();
System.out.println("name1: "+name1);
name = item.getString();
System.out.println("value: "+name);
String value1 = item.getFieldName();
System.out.println("name2: "+value1);
des = item.getString();
System.out.println("value: "+des);
} else {
try {
String itemName = item.getName();
Random generator = new Random();
int r = Math.abs(generator.nextInt());

String reg = "[.*]";
String replacingtext = "";
System.out.println("Text before replacing is:-" + itemName);
Pattern pattern = Pattern.compile(reg);
Matcher matcher = pattern.matcher(itemName);
StringBuffer buffer = new StringBuffer();

while (matcher.find()) {
matcher.appendReplacement(buffer, replacingtext);
}
int IndexOf = itemName.indexOf("."); 
String domainName = itemName.substring(IndexOf);
System.out.println("domainName: "+domainName);

String finalimage = buffer.toString()+"_"+r+domainName;
System.out.println("Final Image==="+finalimage);

File savedFile = new File("C:\\Users\\Ragasudha\\Documents\\NetBeansProjects\\MSIT_PCS\\web\\images\\"+finalimage);
item.write(savedFile);
out.println("<html>");
out.println("<body>");
//out.println("<video width=\"320\" height=\"240\" controls>");
//out.println("<source src="+finalimage+" type=\"video/mp4\"></video>");
 //out.println("<video width=\"320\" height=\"240\" controls>");
 //out.println("<source src="+finalimage+" type=\"video/mp4\"></video>");
// out.println("</video>");
//out.println("<img src="+finalimage+">");
//out.println("</td></tr></table>");

Connection conn = null;
String url = "jdbc:mysql://localhost:3306/";;
String dbName = "PCS";
String driver = "com.mysql.jdbc.Driver";
String username = "root"; 
String userPassword = "root";
String strQuery = null;
String strQuery1 = null;
String imgLen="";
 PrintWriter out1 = response.getWriter();
try {
System.out.println("itemName::::: "+itemName);
Class.forName(driver).newInstance();
conn = (Connection) DriverManager.getConnection(url+dbName,username,userPassword);
Statement st = conn.createStatement();
strQuery = "insert into video values('"+name+"','"+des+"','"+finalimage+"')"; 
int rs = st.executeUpdate(strQuery);
System.out.println("Query Executed Successfully++++++++++++++");
response.sendRedirect("./homepage.html");
out.println("image inserted successfully");
out.println("</body>");
out.println("</html>"); 
} catch (Exception e) {
System.out.println(e.getMessage());
} finally {
conn.close();
} 
} catch (Exception e) {
e.printStackTrace();
}
}
}
}
}
}
