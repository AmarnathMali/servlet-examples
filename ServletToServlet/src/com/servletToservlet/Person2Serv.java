package com.servletToservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/s2url")
public class Person2Serv extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
			//general setting 
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			//reqdata gathering logic
			
			String firstlogicname = request.getParameter("abc");
			String Secondlogicname = request.getParameter("def");
			
			HttpSession ses = request.getSession(false);
			String name = (String) ses.getAttribute("name");
			String age = (String) ses.getAttribute("age");
			String ms = (String) ses.getAttribute("ms");
			
			
		pw.println(name+" "+age+" "+ms+" "+firstlogicname+" "+Secondlogicname);
		}

}
