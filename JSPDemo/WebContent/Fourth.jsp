<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name = request.getParameter("username");
	String colors[]=request.getParameterValues("color");
	if(colors == null)
		{
			out.println(name+" Please select at least one color");
		}
		else
		{
			for(String c:colors){
				out.println("<font color="+c+">Hello: "+name);
			}
			
		}
%>
</body>
</html>