<%-- 
    Document   : signup
    Created on : Jul 15, 2018, 10:38:26 AM
    Author     : Niraj Karanjeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <center>
	<h4>SignUp here</h4>

	<form method ="get" action="./SignUpServlet" >
		<table>

            <tr>
			<td>Full Name:</td>
			<td>
				<input type="text" name="Full_Name">
			</td>
			</tr>
 
            <tr>
			<td>Gender:</td>
			<td>
            <br><input type="radio" value="Male" name="Gender">Male</br>
            <br><input type="radio" value="Female" name="Gender">Female</br>
            <br><input type="radio" value="Others" name="Gender">Others</br>
            </td>
			</tr>

            <tr>
				<td>Date Of Birth:</td>
				<td>
					<input type="Date" name="Dateofbirth">
				</td>
			</tr>

			<tr>
				<td>Phone Number:</td>
				<td>
					<input type="Number" name="PhoneNumber">
				</td>
			</tr>


            <tr>
				<td>Address</td>
				<td>
					<input type="Address" name="Address">
				</td>
			</tr>

			<tr>
			<td>Username:</td>
			<td>
				<input type="text" name="Username">
			</td>
			</tr>

			<tr>
				<td>Password:</td>
				<td>
					<input type="Password" name="Password">
				</td>
			</tr>

			<tr>
				<td>Email:</td>
				<td>
					<input type="Email" name="Email">
				</td>
			</tr>

            

			<td>
				<input type="submit" value="signup">
			</td>
		</table>

	</form>
	
</center>

</body>
</html>
