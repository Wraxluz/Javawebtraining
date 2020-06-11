package com.sjxy.hotel.member.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjxy.hotel.member.entity.Member;
import com.sjxy.hotel.member.service.MemberService;
import com.sjxy.hotel.member.service.impl.MemberServiceImpl;


public class FindByNameServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public FindByNameServlet() {
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
		MemberService goodsService = new MemberServiceImpl();
		String memberName = request.getParameter("memberName");
		List<Member> memberList = goodsService.findByName(memberName);
		request.setAttribute("memberList", memberList);
		request.setAttribute("memberNameMo", memberName);
		request.getRequestDispatcher("/hotel/member/member.jsp").forward(request, response);
	}

}
