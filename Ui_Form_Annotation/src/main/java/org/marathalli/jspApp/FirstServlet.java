package org.marathalli.jspApp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;




@WebServlet("/jsp")
public class FirstServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out=   resp.getWriter();
		out.println("<html><body bgcolor='orange'>"
				+"<h1>Student details:    "+name+"  from   "+place+"<h1> "
				+"</body></html>");
		
		
	}
	

}
