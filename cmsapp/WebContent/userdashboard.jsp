<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.yash.cmsapp.daoimpl.ContactDAOImpl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<div class="header">
	<h1> CMS APP</h1>
		<h3 style="text-align: right;">
			<a href="logout.jsp">LOGOUT</a>
		</h3>
		<h4 style="text-align:center;">
		<a href="createcontact.jsp">1.Create Contact</a><br><br>
		<a href="listcontact.jsp">  2.List Contact</a><br><br>
		<a href="editcontact.jsp">  3.Edit Contact</a><br><br>
		<a href="searchcontact.jsp">4.Search Contact</a><br><br>
		<a href="deletecontact.jsp">5.Delete Contact</a><br>
		
		
		</h4>
	</div>
	<div class="main">
		<br>
		<br>
		<br>Welcome <%=session.getAttribute("name") %> to cms dashboard.
		<jsp:useBean id="test" class="com.yash.cmsapp.daoimpl.ContactDAOImpl"/>
		
	</div>
	<div class="footer">
		<p>&copy; Copyright Created by Pradyumn Joshi</p>
	</div>
	
</body>
</html>