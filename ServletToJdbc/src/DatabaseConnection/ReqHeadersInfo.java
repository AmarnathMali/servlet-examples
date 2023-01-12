package DatabaseConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReqHeadersInfo")
public class ReqHeadersInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     response.setContentType("text/html");
		     PrintWriter pw = response.getWriter();
		     
		     Enumeration en = request.getHeaderNames();
		     while(en.hasMoreElements()){
		    	 String hname = (String) en.nextElement();
		    	 String hvalue = request.getHeader(hname);
		    	 pw.println(hname+" "+hvalue);
		     }
    	 pw.println("hi");
    	}


}
