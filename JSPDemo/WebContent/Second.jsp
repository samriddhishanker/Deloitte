<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int num1=200; %> <%-- instance variable --%>
<% 
	String name="tufail"; 
	int num2=100;		
%>  <%-- local variable --%>
<h1>Deloitte welcomes you</h1>
printed via scriplet: <% out.println("welcome "+name); %><br/>
printed via expressions: <%= "Welcome " + name %> <br/>

sum of num1 + num2 is: <%= num1+num2 %>

<%! int p; %>
</body>
</html>