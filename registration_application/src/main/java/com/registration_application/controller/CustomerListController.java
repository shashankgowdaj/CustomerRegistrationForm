package com.registration_application.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerListRead")
public class CustomerListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CustomerListController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<table border = '2'>");
		out.print("<h2>Customer List</h2>");
		out.print("<tr>");
		
		out.print("<th>");
		out.print("first_name");
		out.print("</th>");
		
		out.print("<th>");
		out.print("last_name");
		out.print("</th>");
		
		out.print("<th>");
		out.print("street");
		out.print("</th>");
		
		out.print("<th>");
		out.print("address");
		out.print("</th>");
		
		out.print("<th>");
		out.print("city");
		out.print("</th>");
		
		out.print("<th>");
		out.print("state");
		out.print("</th>");
		
		out.print("<th>");
		out.print("email");
		out.print("</th>");
		
		out.print("<th>");
		out.print("phone");
		out.print("</th>");
		
		out.print("</tr>");
		
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunbasedata","root","shashank@123");
			Statement stmnt=con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from customer");
		
			
			while(result.next()) {
				
				out.print("<tr>");
				
				out.print("<td>");
				out.print(result.getString(1));
				out.print("</td>");
				
				out.print("<td>");
				out.print(result.getString(2));
				out.print("</td>");
				
				out.print("<td>");
				out.print(result.getString(3));
				out.print("</td>");
				
				out.print("<td>");
				out.print(result.getString(4));
				out.print("</td>");
				
				out.print("<td>");
				out.print(result.getString(5));
				out.print("</td>");
				
				out.print("<td>");
				out.print(result.getString(6));
				out.print("</td>");
				
				out.print("<td>");
				out.print(result.getString(7));
				out.print("</td>");
				
				out.print("<td>");
				out.print(result.getString(8));
				out.print("</td>");
				out.print("</tr>");
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Do Post");
		} 
	}


