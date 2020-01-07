<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<body>
	<%
		String name = (String) session.getAttribute("name");
		String quest1 = (String) session.getAttribute("quest1");
		String quest2 = (String) session.getAttribute("quest2");
		String quest3 = (String) session.getAttribute("quest3");
		int sum=0;
	%>

	<%= name + " ,your score is " %>
	<table border="2">
		<th>SERIAL NUMBER</th>
		<th>YOUR ANSWER</th>
		<th>CORRECT ANSWER</th>
		<th>MARKS OBTAINED</th>
		<tr>
			<td align="center">1.</td>
			<td align="center"><%= quest1 %></td>
			<td align="center">D</td>
			<td align="center">
			<% 
				if(quest1.equals("D")) 
				{
					sum += 10;
					out.println("10");
				}
				else
				{
					out.println("0");
				}
				%>
			</td>
		</tr>
		<tr>
			<td align="center">2.</td>
			<td align="center"><%= quest2 %></td>
			<td align="center">B</td>
			<td align="center">
			<% 
				if(quest2.equals("B")) 
				{
					sum += 10;
					out.println("10");
				}
				else
				{
					out.println("0");
				}
			%>
			</td>
		</tr>
		<tr>
			<td align="center">3.</td>
			<td align="center"><%= quest3 %></td>
			<td align="center">B</td>
			<td align="center">
			<% 
				if(quest3.equals("B")) 
				{
					sum += 10;
					out.println("10");
				}
				else
				{
					out.println("0");
				}
				%>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<h2>TOTAL SCORE : <%= sum %></h2>
			</td>
		</tr>
	</table>
</body>
</html>