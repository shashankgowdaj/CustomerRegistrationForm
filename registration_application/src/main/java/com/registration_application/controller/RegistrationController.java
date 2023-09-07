package com.registration_application.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registration_application.model.DAOService;
import com.registration_application.model.DAOServiceImpl;


@WebServlet("/saveReg")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public RegistrationController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String street = request.getParameter("street");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		
	    boolean statusOfEmail = service.existsByEmail(email);
		boolean statusOfMobile = service.existsByMobile(phone);
		if(statusOfEmail) {
			request.setAttribute("msg", "Email ID Exists");
		}else {
		service.saveRegistration(first_name,last_name,street,address,city,state,email, phone);
		request.setAttribute("msg", "record is saved!");
		}
		
		if(statusOfMobile) {
			request.setAttribute("msg", "MobileNumber Exists");
		}else {
		service.saveRegistration(first_name,last_name,street,address,city,state,email, phone);
		request.setAttribute("msg", "record is saved!");
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/NewCustomer.jsp");
		rd.forward(request, response);

	}
	}
	


