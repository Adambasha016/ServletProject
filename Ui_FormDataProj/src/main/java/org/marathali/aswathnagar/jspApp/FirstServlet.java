package org.marathali.aswathnagar.jspApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

 public class FirstServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String name= req.getParameter("nm");
		String place=req.getParameter("pl");
		String gender=req.getParameter("ge");
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='green'>"+"<h1>DABBA FELLOW "+ name +" form " + place+" gender "+gender+"</h1>"+"</body></html>");
		
	}
	

}
