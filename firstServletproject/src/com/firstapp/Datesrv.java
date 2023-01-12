package com.firstapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Datesrv extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
			//set content type
			res.setContentType("text/html");

			//print object
			PrintWriter pw = res.getWriter();

			//business logic
			Date d = new Date();
			pw.println("<h2 style='color:red'>current date and time is:"+d.toString());

			//close obj
			pw.close();


	}

	
}
