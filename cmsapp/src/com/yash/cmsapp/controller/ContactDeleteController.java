package com.yash.cmsapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.service.ContactService;
import com.yash.cmsapp.serviceimpl.ContactServiceImpl;

/**
 * Servlet implementation class ContactDeleteController which takes input from user and delete that contact.
 */
@WebServlet("/ContactDeleteController")
public class ContactDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContactDeleteController() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactService contactService=new ContactServiceImpl() ;
		
		HttpSession session =request.getSession();
		
		String loggedInUserLoginName=(String)session.getAttribute("loginname");
		Contact.setLoggedInUserLoginName(loggedInUserLoginName);

		String loggedInUserContactName=request.getParameter("name");
		Contact.setLoggedInUserContactName(loggedInUserContactName);

		contactService.deleteContact();
		
		response.sendRedirect("./userdashboard.jsp");

	}

}
