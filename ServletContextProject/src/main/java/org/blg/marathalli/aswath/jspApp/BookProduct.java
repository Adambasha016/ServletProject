package org.blg.marathalli.aswath.jspApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/bp")
public class BookProduct  extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		// to featch context parameters//
		ServletContext ctx=	getServletContext();
		   String offmsg =ctx.getInitParameter("ofm");
		   String offper= ctx.getInitParameter("ofp");
		   PrintWriter out=resp.getWriter();
			out.println("<html><body bgcolor='red'>"+"<h1> book product Details</h1><p>"
			+offmsg+"  "+offper+"%Discount"+
			"<br><a href=\"product.html\">back</a>"+
			"</body></htmal>");
			out.flush();
			out.close();
		}
		

		
	}
	


