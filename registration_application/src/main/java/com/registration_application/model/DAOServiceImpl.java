package com.registration_application.model;

import java.sql.*;

//Inheritance
public class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;
	//PolyMorphism
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunbasedata","root","shashank@123");
			stmnt=con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verifyLogin(String username, String password) {

		try {
			
			ResultSet result = stmnt.executeQuery("select * from login where email='"+username+"' and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

		
	}

	@Override
	public void saveRegistration(String first_name, String last_name, String street, String address,String city,String state,String email,String phone) {
		try {
			stmnt.executeUpdate("insert into customer values('"+first_name+"','"+last_name+"','"+street+"','"+address+"','"+city+"','"+state+"','"+email+"','"+phone+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public boolean existsByEmail(String email) {
try {
			
			ResultSet result = stmnt.executeQuery("select * from customer where email='"+email+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean existsByMobile(String mobile) {
try {
			
			ResultSet result = stmnt.executeQuery("select * from customer where mobile='"+mobile+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void deleteRegistration(String first_name) {
		try {
			stmnt.executeUpdate("delete from customer where first_name='"+first_name+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateRegistration(String first_name) {
		try {
			stmnt.executeUpdate("UPDATE customer SET first_name = '"+first_name+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	
}
