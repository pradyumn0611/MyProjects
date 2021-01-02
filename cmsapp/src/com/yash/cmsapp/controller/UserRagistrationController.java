package com.yash.cmsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.serviceimpl.UserServiceImpl;

/**
 * Servlet  UserRagistrationController completes the ragistration process with csmapp.
 */
@WebServlet("/UserRagistrationController")
public class UserRagistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1 getting data from userform
		// 2 prepared model
		//3 sharing model with service
		//4 redirecting on view
		UserService userService=new UserServiceImpl() ;
		

		String name=request.getParameter("name");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		String email =request.getParameter("email");
		String loginname=request.getParameter("loginname");
		String password=request.getParameter("password");
		User user=new User(name,contact,address,email,1,1,loginname,password);
		userService.ragisterUser(user);
		

		response.sendRedirect("./index.jsp");

	}

}
