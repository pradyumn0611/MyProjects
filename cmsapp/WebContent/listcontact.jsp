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
	<div class="main">
	CMS LIST CONTACT<br><br>
			<form method="post" action="ContactListController">
				<table>

					<tr>
						<td></td>
						<td>List  contacts of <%=session.getAttribute("name") %> </td>
					</tr>

					

				<tr>
						<td></td>
						
						<td>&nbsp;&nbsp;<input type="submit" value="list" /></td>
					</tr>
					
				</table>
			</form>	
	</div>
	<div class="footer">
		<p>&copy; Copyright Created by Pradyumn Joshi</p>
	</div>
	
</body>
</html>