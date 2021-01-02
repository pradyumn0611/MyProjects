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
<div class="wrap">
	<div class="container">
		<jsp:include page="header.jsp"></jsp:include>

		<div class="main">
			CMS SIGNUP<br><br>
			<form method="post" action="UserRagistrationController">
				<table>

					<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>

					<tr>
						<td>Contact</td>
						<td><input type="text" name="contact"></td>
					</tr>

					<tr>
						<td>Login Name</td>
						<td><input type="text" name="loginname"></td>
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
						<td>Password</td>
						<td><input type="password" name="password" /></td>
					</tr>

					<tr>
						<td></td>
						
						<td>&nbsp;&nbsp;<input type="submit" value="register" /></td>
					</tr>
				</table>
			</form>
			</div>
			<div class="footer">
		<p> &copy; Copyright Created by Pradyumn Joshi</p>
		</div>
		</div>

	</div>

</body>
</html>