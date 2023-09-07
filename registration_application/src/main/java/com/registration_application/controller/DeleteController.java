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


@WebServlet("/DeleteReg")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DeleteController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
	    
		
		service.deleteRegistration(first_name);
		request.setAttribute("msg", "record is Deleted!");
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/DeleteCustomer.jsp");
		rd.forward(request, response);

	}
	}
	


