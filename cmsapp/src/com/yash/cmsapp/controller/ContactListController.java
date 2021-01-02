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
 * This servlet takes request of creating contact for user and does it.
 * @author pradyumn
 *
 */
@WebServlet("/ContactListController")
public class ContactListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ContactListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactService contactService=new ContactServiceImpl() ;
		
		List<Contact>list=new ArrayList<>();
		list=contactService.listContact();
	
		HttpSession session=request.getSession();
		String loggedInUserLoginName=(String)session.getAttribute("loginname");
		Contact.setLoggedInUserLoginName(loggedInUserLoginName);
		
		
		session.setAttribute("list", list);
		response.sendRedirect("displayfindall.jsp");
	}

}
