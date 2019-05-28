package com.briup.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.EsCustomer;
import com.briup.service.EsCustomerServiceImpl;

/**
 * Servlet implementation class ERegisterServlet
 */
@WebServlet("/ERegister")
public class ERegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String zipcode = request.getParameter("zipCode");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		
		EsCustomer customer = new  EsCustomer();
		customer.setEmail(email);
		customer.setName(name);
		customer.setPassword(password);
		customer.setTelephone(telephone);
		customer.setZipcode(zipcode);
		EsCustomerServiceImpl serviceImpl = new EsCustomerServiceImpl();
		System.out.println(customer);
		serviceImpl.cutomerRegister(customer);
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
