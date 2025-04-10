

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



public class GetResult extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   int id = Integer.parseInt(request.getParameter("id"));
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HYD","root", "root");
			
		  String s = "select * from student where id=?";
		  PreparedStatement pstmt = con.prepareStatement(s);
		  pstmt.setInt(1, id);
		  ResultSet res = pstmt.executeQuery();

		  if(res.next()) {
			   id = res.getInt(2);
			  String name = res.getString(1);
			  int marks1 = res.getInt(3); 
			  int marks2 = res.getInt(4);
			  int marks3 = res.getInt(5);
			     PrintWriter out = response.getWriter();
			  out.println(id+" "+name+" "+marks1+" "+marks2+" "+marks3);
		  }
		
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
