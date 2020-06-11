package com.sjxy.hotel.member.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sjxy.hotel.member.service.MemberService;
import com.sjxy.hotel.member.service.impl.MemberServiceImpl;
@WebServlet("/delMember.do")
public class DelMemberService extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public DelMemberService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		String meId = request.getParameter("meId");
		Integer meId1 = Integer.valueOf(meId);
		MemberService memberService = new MemberServiceImpl();
		memberService.delete(meId1);
		request.getRequestDispatcher("member.do").forward(request, response);
	}
}
