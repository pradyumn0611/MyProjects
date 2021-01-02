
<%@page import="com.yash.cmsapp.domain.Contact"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	</div>
	<div class="main" style="overflow: auto;">
	CMS LIST CONTACT<br><br>
			<form method="post" action="ContactListController">
				<table>

					<tr>
						
						<td>Contacts of <%=session.getAttribute("name") %> are : </td>
						<td></td>
					</tr>
					
				<%
			
				List list=(List)session.getAttribute("list");
				%>
				

				<tr>
				<td>
				<% if(list.isEmpty())
					out.println(" NO Matching results found.");
				else
					for(int i=0;i<list.size();i++){%>
					<br>	
					<%out.println(list.get(i));}
					%>
					</td></tr>
				
				</table>
			</form>	
	</div>
	<div class="footer">
		<p>&copy; Copyright Created by Pradyumn Joshi</p>
	</div>
	
</body>
</html>