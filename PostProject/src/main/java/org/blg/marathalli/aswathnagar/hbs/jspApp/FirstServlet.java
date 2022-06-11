package org.blg.marathalli.aswathnagar.hbs.jspApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet  extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		  String sid= req.getParameter("id");
		  int id=Integer.parseInt(sid);
		  String name=req.getParameter("nm");
		  String dept=req.getParameter("dp");
		  String sperc=req.getParameter("pr");
		   double perc= Double.parseDouble(sperc);
		  PrintWriter out=resp.getWriter();
		  out.println(" <html><body bgcolor='#b510e3'> "
		  		+ "<h1> Student Details Are:"+name+"  "+dept+"</h1>"+
				  "</body></html>");
		  
		  out.flush();
		  out.close();
		  
		  // JDBC CODE//
		  Connection con=null;
		  PreparedStatement pstmt=null;
		  String iQuery="insert into jsp.Student1 values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connection");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=mohan");
		    System.out.println("connetion estableshed");
			pstmt=con.prepareStatement(iQuery);
			System.out.println("query are executed");
		    //set data for place holder//
		    pstmt.setInt(1,id);
		    pstmt.setString(2, name);
		    pstmt.setString(3, dept);
		    pstmt.setDouble(4, perc);
		    pstmt.executeUpdate();
		    System.out.println("udating");
		    
		    
		} catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("ALL THE COSTELY RESOURSEC RAE CLOSED");
	}

}
