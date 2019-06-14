package com.Food;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Food.Dao.Get_connection;

@WebServlet("/Admin_cust_delete")
public class Admin_cust_delete extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		String cust_email=request.getParameter("cust_email");
		System.out.println(cust_email);
		Get_connection obj = new Get_connection();
		Connection con = obj.get();
		try
		{
			String sql1="delete from cust where cust_email='"+request.getParameter("cust_email")+"' ";
			System.out.println(sql1);
		    Statement statement1 = con.createStatement();
			statement1.executeUpdate(sql1);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		response.sendRedirect("admin_cust_list.jsp");
	}
}