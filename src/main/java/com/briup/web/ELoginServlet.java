package com.briup.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.EsBook;
import com.briup.bean.EsCustomer;
import com.briup.bean.EsCustomerExample;
import com.briup.dao.mapperInterface.EsCustomerMapper;
import com.briup.service.EsBookServiceImpl;
import com.briup.service.EsCustomerServiceImpl;

public class ELoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ELoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		
		List<EsCustomer> list = new EsCustomerServiceImpl().customerLoging(name, password);
		
		if(list!=null&& list.size()!=0 ) {
			System.out.println("当前存在用户，登录成功");
			
			//查询所有的数据，并且保存他们的信息
			List<EsBook> booklist = new EsBookServiceImpl().findAllBooks();
			System.out.println(booklist);
			session.setAttribute("booklist", booklist);
			
			response.sendRedirect("jsp/index.jsp");

		}else {
			System.out.println("登录失败");
		}
		
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
