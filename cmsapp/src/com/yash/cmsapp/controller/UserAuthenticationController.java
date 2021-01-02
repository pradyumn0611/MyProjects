package com.yash.cmsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.serviceimpl.UserServiceImpl;
/**
 *  This servlet checks weather credentials of user are ragistered with cmsapp or not. 
 * @author pradyumn
 *
 */
@WebServlet("/UserAuthenticationController")
public class UserAuthenticationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UserService userService=null;
	public UserAuthenticationController() {
		super();
		userService=new UserServiceImpl();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginname=request.getParameter("loginname");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		User authenticationStatus=userService.userAuthentication(loginname, password);
		if(authenticationStatus!=null)
		{
			
			HttpSession session=request.getSession();
			session.setAttribute("name",authenticationStatus.getName());
			session.setAttribute("loginnameContact",authenticationStatus.getLoginname());
			session.setAttribute("loginname",loginname);
			
			out.println(authenticationStatus.getId());
			RequestDispatcher dispatcher=request.getRequestDispatcher("./userdashboard.jsp");
			dispatcher.forward(request, response);
		}
		else 
		{
			response.sendRedirect("./index.jsp");
		}
	}
}
