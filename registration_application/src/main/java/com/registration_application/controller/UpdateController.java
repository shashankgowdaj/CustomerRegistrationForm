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


@WebServlet("/UpdateReg")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UpdateController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
	    
		
		service.updateRegistration(first_name);
		request.setAttribute("msg", "record is Updated!");
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/UpdateCustomer.jsp");
		rd.forward(request, response);

	}
	}
	


