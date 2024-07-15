

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
public class HelloServlet extends HttpServlet
{
protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
{
	//create printWriter object to print response.
	PrintWriter out=response.getWriter();
	String s=request.getParameter("F1");
	String s1=request.getParameter("L1");
	out.println("<h1>Hello,"+s+s1);
	out.close();
	
}
}
