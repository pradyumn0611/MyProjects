package com.yash.cmsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class CreateContactController creates contact request for user .
 */
@WebServlet("/CreateContactController")
public class CreateContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ContactService contactService=new ContactServiceImpl() ;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession session =request.getSession();

		String loggedInUserLoginName=(String)session.getAttribute("loginname");
		Contact.setLoggedInUserLoginName(loggedInUserLoginName);

		String name=request.getParameter("name");
		String con=request.getParameter("contact");
		String address=request.getParameter("address");
		String email =request.getParameter("email");
		Contact contact=new Contact(name,con,address,email);
		contactService.createContact(contact);
		//out.println(loginnameContact+name+con+address+email);
		response.sendRedirect("./userdashboard.jsp");
	}

}
