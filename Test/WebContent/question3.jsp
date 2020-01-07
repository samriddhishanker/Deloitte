<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<form action="answer3">
		<tr>
		<td>QUESTION 3 :</td><br/>
		<td>
			<input type="radio" name="quest3" id="quest3" value="A" />A<br/>
			<input type="radio" name="quest3" id="quest3" value="B" />B<br/>
			<input type="radio" name="quest3" id="quest3" value="C" />C<br/>
			<input type="radio" name="quest3" id="quest3" value="D" />D<br/>
		</td>
		</tr>
		<tr>
			<td><input type="submit" value="NEXT"></td>
		</tr>
</form>
<%
	String quest3 = request.getParameter("quest3");
	session.setAttribute("quest3", quest3);
%>
</body>
</html>