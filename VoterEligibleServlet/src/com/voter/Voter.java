package com.voter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Voter extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			//set content type
			res.setContentType("text/html");

			//print object
			PrintWriter pw = res.getWriter();
			
			//req data gathering logic
			
			String age = req.getParameter("age");
			int ageValue = Integer.parseInt(age);

			//business logic
			
			if(ageValue >= 18)
			{
				pw.println("<h2 style='color:green'>you are Eligible for voting</h2>");
			}
			else
			{
				pw.println("<h2 style='color:red'>you are not eligible to vote</h2>");
			}
			//close obj
			pw.close();

	}

}
