<%@page import="com.cms.deloitte.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! Customer customer = new Customer(); %>
<% customer=(Customer)session.getAttribute("custDetails"); %> 

<h2>These are the following details of customer</h2>
<% out.println("custDetails"); %>
</body>
</html>

