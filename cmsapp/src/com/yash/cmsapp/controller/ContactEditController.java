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
 * Servlet implementation class ContactEditController which edits contact as per user need.
 */
@WebServlet("/ContactEditController")
public class ContactEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactEditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactService contactService=new ContactServiceImpl() ;
		
		HttpSession session =request.getSession();
		
		Contact.loggedInUserLoginName=(String)session.getAttribute("loginname");
		
		
		Contact.loggedInUserContactName=request.getParameter("loggedInUserContactName");
		
		String name=request.getParameter("name");
    	String con=request.getParameter("contact");
    	String address=request.getParameter("address");
    	String email =request.getParameter("email");
    	Contact contact=new Contact(name,con,address,email);
    	contactService.editContact(contact);
    	//out.println(loginnameContact+name+con+address+email);
		response.sendRedirect("./userdashboard.jsp");
	}

}
