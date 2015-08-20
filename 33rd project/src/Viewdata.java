

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



@WebServlet("/Viewdata")
public class Viewdata extends HttpServlet {
	private String message;
	
	
	 ArrayList<String> a;
	 ArrayList<Integer> g;
	 ArrayList<Integer> s;
	String a2 = "";
	String g2 = "";
	String s2 = "";
	int avg = 0;
	int h = 0;
	int l = 101;

	  public void init() throws ServletException
	  {
	      // Do required initialization
		 
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
		  
		  String temp_id = request.getParameter("id");
		  int id = 0;
		  if(temp_id != null)
		  {
			 id = Integer.parseInt(temp_id);
		  }
		  String temp_type = request.getParameter("type");
		  int type = 0;
		  if(temp_type != null)
		  {
			 type = Integer.parseInt(temp_type);
		  }
		  String temp_avgid = request.getParameter("avgid");
		  int avgid = 0;
		  if(temp_avgid != null)
		  {
			 avgid = Integer.parseInt(temp_avgid);
		  }
		  String temp_avgtype = request.getParameter("avgtype");
		  int avgtype = 0;
		  if(temp_avgtype != null)
		  {
			 avgtype = Integer.parseInt(temp_avgtype);
		  }
		  String temp_hltype = request.getParameter("hltype");
		  int hltype = 0;
		  if(temp_hltype != null)
		  {
			 hltype = Integer.parseInt(temp_hltype);
		  }
		  
		  
		  
		 // System.out.print(id + " ");
		 // System.out.print(type + " ");
		 // System.out.print(avgid + " ");
		 // System.out.print(avgtype + " ");
		 // System.out.println(hltype);
		  
		  String url = "";
		  Connection conn = null;
		  
		  
		  try
			{
		    	Class.forName("oracle.jdbc.driver.OracleDriver");
				
		    	url = "jdbc:oracle:thin:testuser/password@localhost"; 

		    	
				//properties for creating connection to Oracle database
				Properties props = new Properties();
				props.setProperty("user", "testdb");
				props.setProperty("password", "password");
			   
		    	
		    	conn = DriverManager.getConnection(url,props);
			}	
		  
		  catch (Exception e)
			{
				e.printStackTrace();
			}
		  
		  
		  
		 //first query 
		 if( type==0 && avgid == 0 && avgtype == 0 && hltype == 0 )
		 {
			
			try{
				
			 String sql = "select assignment from " + "STUDENTS " + "where id = ?";
			 
		   	PreparedStatement preStatement = conn.prepareStatement(sql);
		   	preStatement.setInt(1,id);
		   	
			ResultSet result = preStatement.executeQuery();
				
			a2 = "";
			g2 = "";
			s2 = "";
			while(result.next())
			{
				String cura = result.getString("ASSIGNMENT");
				a2 += cura + "<br>";
				
			}
			
			 
			}
		  
		    catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		 
		
		 //Second query 
		 else if( id == 0 && avgid == 0 && avgtype == 0 && hltype == 0 )
		 {
			
			try{
				
			 String sql = "select assignment from " + "STUDENTS " + "where atype = ?";
			 
		   	PreparedStatement preStatement = conn.prepareStatement(sql);
		   	preStatement.setInt(1,type);
		   	
			ResultSet result = preStatement.executeQuery();
				
			a2 = "";
			g2 = "";
			s2 = "";	
			while(result.next())
			{
				String cura = result.getString("ASSIGNMENT");
				a2 += cura + "<br>";
				
			}
			
			 
			}
		  
		    catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		 
		
		 
		 //Third query 
		 else if( avgid == 0 && avgtype == 0 && hltype == 0 )
		 {
			
			try{
				
			 String sql = "select assignment from " + "STUDENTS " + "where atype = ? and id = ?";
			 
		   	PreparedStatement preStatement = conn.prepareStatement(sql);
		   	preStatement.setInt(1,type);
		   	preStatement.setInt(2,id);
		   	
			ResultSet result = preStatement.executeQuery();
				
			a2 = "";
			g2 = "";
			s2 = "";	
			while(result.next())
			{
				String cura = result.getString("ASSIGNMENT");
				a2 += cura + "<br>";
				
			}
			
			 
			}
		  
		    catch (Exception e)
			{
				e.printStackTrace();
			}
		} 
		  
		 
		 
		 //fourth query 
		 else if( id ==0 && type==0 && avgtype == 0 && hltype == 0 )
		 {
			
			try{
				
			 String sql = "select grade from " + "STUDENTS " + "where id = ?";
			 
		   	PreparedStatement preStatement = conn.prepareStatement(sql);
		  
		   	preStatement.setInt(1,avgid);
		   	
			ResultSet result = preStatement.executeQuery();
				
			a2 = "";
			g2 = "";
			s2 = "";
			int count = 0;
			int sum = 0;
			while(result.next())
			{
				
				int curg = result.getInt("GRADE");
				sum = sum + curg;
				count++;
				
			}
				avg = sum/count;
			 
			}
				
			
			catch (Exception e)
			{
				e.printStackTrace();
			}
		} 
		
		 
		 //fifth query 
		 else if( id ==0 && type==0 && hltype == 0 )
		 {
			
			try{
				
			 String sql = "select grade from " + "STUDENTS " + "where id = ? and atype = ?";
			 
		   	PreparedStatement preStatement = conn.prepareStatement(sql);
		  
		   	preStatement.setInt(1,avgid);
		   	preStatement.setInt(2,avgtype);
		   	
			ResultSet result = preStatement.executeQuery();
				
			a2 = "";
			g2 = "";
			s2 = "";
			int count = 0;
			int sum = 0;
			while(result.next())
			{
				
				int curg = result.getInt("GRADE");
				sum = sum + curg;
				count++;
				
			}
				avg = sum/count;
			 
			}
				
			
			catch (Exception e)
			{
				e.printStackTrace();
			}
		} 
		 

		 //Sixth query 
		 else if( id ==0 && type==0 && avgid == 0 && avgtype == 0 )
		 {
			
			try{
				
			String sql = "select grade from " + "STUDENTS " + "where atype = ?";
			 
		   	PreparedStatement preStatement = conn.prepareStatement(sql);
		  
		   
		   	preStatement.setInt(1,hltype);
		   	
			ResultSet result = preStatement.executeQuery();
				
			a2 = "";
			g2 = "";
			s2 = "";
			g = new ArrayList<Integer>();
			while(result.next())
			{
				
				int curg = result.getInt("GRADE");
				g.add(curg);
				
			}
			
			
			
			for(int i=0; i<g.size(); i++)
			{
				if(g.get(i) < l)
				{
					l = g.get(i);
				}
			}
			
			for(int i=0; i<g.size(); i++)
			{
				if(g.get(i) > h)
				{
					h = g.get(i);
				}
			}
			 
			}
				
			
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}  
		 
		  	
		  	
		 
		 
		 
		  
	      // Set response content type
	      response.setContentType("text/html");
 	      
	      request.setAttribute("assignments",a2);
	      request.setAttribute("average", avg);
	      request.setAttribute("high", h);
	      request.setAttribute("low", l);
	      
	      getServletContext()
	      	.getRequestDispatcher("/output2.jsp")
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
