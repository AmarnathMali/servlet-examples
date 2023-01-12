package DatabaseConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseRetirveData extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String uname = request.getParameter("username");
			String pwd = request.getParameter("password");
			 
			Connection con = null;
		    PreparedStatement ps = null;
		    try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","root");
				String qry = "select count(*) from user_info where username=? and password=?";
			    ps = con.prepareStatement(qry);
			    ps.setString(1, uname);
			    ps.setString(2, pwd);
			    ResultSet rs = ps.executeQuery();
			    while(rs.next()){
			    	int result = rs.getInt(1);
			    	if(result == 1){
			    		pw.println(uname+"  "+pwd);
			    	}else{
			    		pw.println("please enter valid details"); 
			    	}
			    }
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    finally{
		    	if(ps != null){
		    		try {
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	}
		    	if(con != null){
		    		try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	}
		    	if(pw != null){
		    		pw.close();
		    	}
		    }
	}

}
