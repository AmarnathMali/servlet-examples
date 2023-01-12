package com.servletToservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/resultcube")

public class ResultCube extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//general setting
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
		//request object

		 String value = request.getParameter("val1");
		 int val = Integer.parseInt(value);
		 
		 int cube = val*val*val;
		// pw.println("cube is: "+cube);
		 
		 
		 HttpSession ses = request.getSession(false);
		 int square = (Integer) ses.getAttribute("result");
		 //business logic
		pw.println("Square and cube is: "+square+" "+cube);
	}

}
