package com.loginApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//set content type
			response.setContentType("text/html");
			
		 //print object type
		 PrintWriter pw = response.getWriter();
		 
		 //request gathering logic
		 String uname = request.getParameter("username");
		 String pword = request.getParameter("password");
		 
		 //businesss logic
		 
		 if((uname.equals("admin")) && (pword.equals("admin123"))){
			 pw.println("<h2 style='color:green'>welcome login succesful!!!</h2>");
		 }else{
			 pw.println("<h2 style='color:red'>please check login and password</h2>");
		 }
		
		
		pw.close();
		
		}

	
		

}
