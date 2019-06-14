package com.Food;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Food.Dao.Get_connection;

@WebServlet("/Admin_rest_delete")
public class Admin_rest_delete extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		String rest_id=request.getParameter("rest_id");
		System.out.println(rest_id);
		Get_connection obj = new Get_connection();
		Connection con = obj.get();
		try
		{
			String sql1="delete from restaurant where rest_id="+request.getParameter("rest_id");
			System.out.println(sql1);
		    Statement statement1 = con.createStatement();
			statement1.executeUpdate(sql1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		response.sendRedirect("admin_rest_list.jsp");
	}
}