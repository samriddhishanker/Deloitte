<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<%
		out.println("Welcome: "+session.getAttribute("name"));
	%>
	<br/>
	<br/>
<form action="Answer1">
		<tr>
		<td>QUESTION 1 :</td><br/>
		<td>
			<input type="radio" name="quest1" id="quest1" value="A" />A<br/>
			<input type="radio" name="quest1" id="quest1" value="B" />B<br/>
			<input type="radio" name="quest1" id="quest1" value="C" />C<br/>
			<input type="radio" name="quest1" id="quest1" value="D" />D<br/>
		</td>
		</tr>
		<tr>
			<td><input type="submit" value="NEXT"></td>
		</tr>
</form>
<br/>
</body>
</html>