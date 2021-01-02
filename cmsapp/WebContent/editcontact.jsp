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
	CMS EDIT CONTACT<br><br>
			<form method="post" action="ContactEditController">
				<table>
					<tr>
						<td>Edit :Enter Contact Name</td>
						<td><input type="text" name="loggedInUserContactName"></td>
					</tr>
			<tr><td> </td></tr>
			<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>

					<tr>
						<td>Contact</td>
						<td><input type="text" name="contact"></td>
					</tr>

				
					
					<tr>
					<td>Address</td>
						<td><input type="text" name="address"></td>
					</tr>
					
					<tr>
					<td>Email</td>
						<td><input type="text" name="email"></td>
					</tr>

				<tr>
						<td></td>
						
						<td>&nbsp;&nbsp;<input type="submit" value="edit" /></td>
					</tr>
				</table>
			</form>	
	</div>
	<div class="footer">
		<p>&copy; Copyright Created by Pradyumn Joshi</p>
	</div>
	
</body>
</html>