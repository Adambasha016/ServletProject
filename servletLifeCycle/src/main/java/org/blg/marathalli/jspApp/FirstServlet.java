package org.blg.marathalli.jspApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;

//@WebServlet(urlPatterns="/jsp",loadOnStartup = 4) by using annotation
public class FirstServlet extends GenericServlet
{
	public FirstServlet() 
	{
		System.out.println(" JEE CONTAINER CREATS SELVLET OBJECT BY CALLING DEFALT CONSTRUCTR");
	}
	@Override
	public void init(ServletConfig config) 
			throws ServletException
	{
		System.out.println(" SERVELT OBJECT INTILIZED BY CALLIG INIT()");
	
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException
	{
		
		String name=req.getParameter("nm");
		 String place=  req.getParameter("pl");
		 PrintWriter out= resp.getWriter();
		 out.print("<html><body bgcolor='yellow'><h1> the student  "+name+"  from "+place+"</h1></body></html>");
		 System.out.println("service() called by jee container");
		 out.flush();
	}
	@Override
	public void destroy() 
	{
		System.out.println("destroy() called");
	}

}
