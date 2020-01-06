package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Product() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usern = request.getParameter("username");
		String pass = request.getParameter("Password");
		response.getWriter().println("<h1>Welcome to my website: "+usern);
		response.getWriter().println("<h1>Your password is : "+pass);
		response.getWriter().println("<h1><a href='Shop.html'> Shop</a>");
	}

}
