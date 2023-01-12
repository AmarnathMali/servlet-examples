package com.calculatorApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CalculatorServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// set content type
			response.setContentType("text/html");
			
			//print object type
			PrintWriter pw = response.getWriter();
			
			//req object
		    String num1 = request.getParameter("val1");
		    String num2 = request.getParameter("val2");
		   String operand = request.getParameter("b1");
			int a = Integer.parseInt(num1);
			int b = Integer.parseInt(num2);
			switch(operand){
			case "add":
				     pw.println(a+b);
				     break;
			case "sub":
				    pw.println(a-b);
				    break;
			case "div":
				    pw.println(a/b);
				    break;
			case "mul":
				    pw.println(a*b);
				    break;
			case "name":
				    pw.println("hi dude");
				    break;
			default:
				    pw.println("choose correctly");
				    break;
			}
			    pw.close();
		}

	 
     
}
