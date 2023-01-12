package com.servletToservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PersonSrv extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//general setting
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
		//request object
		HttpSession ses = request.getSession(true);
		 String name = request.getParameter("name");
		 String age = request.getParameter("age");
		 String ms = request.getParameter("ms");
		 
		 ses.setAttribute("name", name);
		 ses.setAttribute("age", age);
		 ses.setAttribute("ms", ms);
		 
		 //business logic
		 if(ms.equals("married")){
			 pw.println("<form action='s2url' method = 'post'>");
			 pw.println("<label>enter your spouse name:</label>");
			 pw.println("<input type='text' name='abc'>");
			 pw.println("<br><br>");
			 pw.println("<label>enter no.of children</label>");
			 pw.println("<input type='text' name='def'>");
			 pw.println("<br><br>");
			 pw.println("<input type='submit' value='register'>");
			 pw.println("</form>");
			 
		 }else{
			 pw.println("<form action='s2url' method='post'>");
			 pw.println("<label>When to marry:</label>");
			 pw.println("<input type='text' name='abc'>");
			 pw.println("<br><br>");
			 pw.println("<label>Any expectation</label>");
			 pw.println("<input type='text' name='def'>");
			 pw.println("<br><br>");
			 pw.println("<input type='submit' value='register'>");
			 pw.println("</form>");
			 
		 }
	
	}

}
