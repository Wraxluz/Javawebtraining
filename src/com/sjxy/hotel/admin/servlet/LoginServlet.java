package com.sjxy.hotel.admin.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjxy.hotel.admin.entity.Admin;
import com.sjxy.hotel.admin.service.AdminService;
import com.sjxy.hotel.admin.service.impl.AdminServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		String name =  request.getParameter("num");
        String password = request.getParameter("password");
        AdminService adminService = new AdminServiceImpl();
        Admin admin = adminService.login(name, password);
        if (admin!=null) {
			if (admin.getAdmin_per().equals("系统管理员")) {
				request.setAttribute("loginUser", admin.getAdmin_name());
				request.getRequestDispatcher("/hotel/loginSuccess/adminLoginSuccess.jsp").forward(request,response);
			} else if(admin.getAdmin_per().equals("酒店前台")){
				request.setAttribute("loginUser", admin.getAdmin_name());
				request.getRequestDispatcher("/hotel/loginSuccess/receptionLoginSuccess.jsp").forward(request,response);
			} else if(admin.getAdmin_per().equals("经理")){
				request.setAttribute("loginUser", admin.getAdmin_name());
				request.getRequestDispatcher("/hotel/loginSuccess/managerLoginSuccess.jsp").forward(request,response);
			} else {
				request.setAttribute("error", "您没有权限登录该系统，请联系管理员");
				request.getRequestDispatcher("/index.jsp").forward(request,response);
			}
		} else {
			request.setAttribute("error", "账号或密码错误，请重新输入");
			request.getRequestDispatcher("/index.jsp").forward(request,response);
		}
	}

}
