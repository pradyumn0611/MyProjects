package com.yash.cmsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class ContactSearchController and does search of contacts for user.
 */
@WebServlet("/ContactSearchController")
public class ContactSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContactSearchController() {
		super();
		// TODO Auto-generated constructor stub
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactService contactService=new ContactServiceImpl() ;
		Contact contact=new Contact();
		
		List<Contact>list=new ArrayList<>();
		String name=request.getParameter("name");
		Contact.setLoggedInUserContactName(name);
		list=contactService.searchContact();
		PrintWriter out=response.getWriter();
		out.println(list);
		out.println("   "+name);
		
		HttpSession session =request.getSession();
		;
		session.setAttribute("list", list);
		response.sendRedirect("searchdisplay.jsp");

	}

}
