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
			
		CMS SIGNIN<br><br><br><br>
		

			<form method="post" action="UserAuthenticationController">
				<table>
					<tr>
						<td>login name</td>
						<td><input type="text" name="loginname"></td>
					</tr>
					<tr>
						<td>login password</td>
						<td><input type="password" name="password"></td>
					</tr>
					
				</table>
				<b>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				<a href="signup.jsp">register</a>
				<input type="submit" name="register" /></b>
			</form>
			</div>
		
			<div class="footer">
		<p> &copy; Copyright Created by Pradyumn Joshi</p>
		</div>
		</div>

	</div>



</body>
</html>