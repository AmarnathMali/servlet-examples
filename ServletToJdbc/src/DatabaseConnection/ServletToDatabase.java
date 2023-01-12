package DatabaseConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletToDatabase extends HttpServlet {
	
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
			String qry = "insert into user_info values(?,?)";
		    ps = con.prepareStatement(qry);
		    ps.setString(1, uname);
		    ps.setString(2, pwd);
		    int result = ps.executeUpdate();
		    if(result==1){
		    	pw.println("register successful");
		    }else{
		    	pw.println("lol !!!");
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
