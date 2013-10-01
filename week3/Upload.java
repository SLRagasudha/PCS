/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author Ragasudha
 */
public class Upload extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String filepath;
        filepath = req.getPathInfo();
        System.out.println(filepath);
    }
            
}
