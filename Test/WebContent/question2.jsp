<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<form action="Answer2">
		<tr>
		<td>QUESTION 2 :</td><br/>
		<td>
			<input type="radio" name="quest2" id="quest2" value="A" />A<br/>
			<input type="radio" name="quest2" id="quest2" value="B" />B<br/>
			<input type="radio" name="quest2" id="quest2" value="C" />C<br/>
			<input type="radio" name="quest2" id="quest2" value="D" />D<br/>
		</td>
		</tr>
		<tr>
			<td><input type="submit" value="NEXT"></td>
		</tr>
</form>
<%
	String quest2 = request.getParameter("quest2");
	session.setAttribute("quest2", quest2);
%>
</body>
</html>