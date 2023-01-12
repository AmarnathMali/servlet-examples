package com.servletToservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/resultsquare")

public class ResultSquare extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//general setting
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
		//request object

		 String value = request.getParameter("val1");
		 int val = Integer.parseInt(value);
		 
		 int square = val*val;
		 //pw.println("square is: "+square);

		 HttpSession ses = request.getSession();
		 ses.setAttribute("result", square);
		 
		 RequestDispatcher rd = request.getRequestDispatcher("/resultcube");
		 //rd.include(request, response);
		 rd.forward(request, response);
		 
		 //session obj
		
	}

}
