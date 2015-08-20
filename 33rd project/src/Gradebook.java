

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
/**
 * Servlet implementation class helloworld
 */



@WebServlet("/Gradebook")
public class Gradebook extends HttpServlet {
	private String message;
	
	String name = "";
	String n = "";
	String first = "";
	String last = "";
	String fname = "";
	String lname = "";
	int sum = 0;
	int count = 0;
	int avg = 0;
	 ArrayList<Integer> grades;
	 ArrayList<String> as;
	 String gr = "";
	
	

	  public void init() throws ServletException
	  {
	      // Do required initialization
		 
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
		  grades = new ArrayList<Integer>();
		  as = new ArrayList<String>();
		  
		  String id_temp=request.getParameter("id");
		  int id = Integer.parseInt(id_temp);
		  String assignment = request.getParameter("as");
		  String temp_type = request.getParameter("type");
		  int atype = Integer.parseInt(temp_type);
		  String date = request.getParameter("date");
		  String temp_grade = request.getParameter("grade");
		  int grade = Integer.parseInt(temp_grade);
		  
		  //System.out.println(id + " " + assignment + " " + atype + " " + date + " " + grade );
		  
		  
		  try
			{
		    	Class.forName("oracle.jdbc.driver.OracleDriver");
				
		    	String url = "jdbc:oracle:thin:testuser/password@localhost"; 

		    	
				//properties for creating connection to Oracle database
				Properties props = new Properties();
				props.setProperty("user", "testdb");
				props.setProperty("password", "password");
			   
		    	
		    	Connection conn = DriverManager.getConnection(url,props);

				String sql ="INSERT INTO students (ID, ASSIGNMENT, ATYPE, ADATE, GRADE) " + "VALUES (?, ?, ?, TO_DATE(?,'YYYY/MM/DD'), ?)";

				//creating PreparedStatement object to execute query
				PreparedStatement preStatement = conn.prepareStatement(sql);

				preStatement.setInt(1,id);
				preStatement.setString(2, assignment);
				preStatement.setInt(3, atype);
				preStatement.setString(4, date);
				preStatement.setInt(5, grade);
				
				preStatement.executeQuery();
			}
		  
		    catch (Exception e)
			{
				e.printStackTrace();
			}
		  
		  
		  
		  
	      // Set response content type
	      response.setContentType("text/html");

	     
	      
	  
	      
	      getServletContext()
	      	.getRequestDispatcher("/output.jsp")
	      	.forward(request, response);
	 
	   }
	  
	  public void doPost(HttpServletRequest request,
              HttpServletResponse response)
      throws ServletException, IOException
      {
		  doGet(request, response);
      }

	   public void destroy() 
	   { 
	     // do nothing. 
	   } 

}
