package com.sjxy.hotel.member.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjxy.hotel.member.entity.Member;
import com.sjxy.hotel.member.service.MemberService;
import com.sjxy.hotel.member.service.impl.MemberServiceImpl;

@WebServlet("/member.do")
public class MemberServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int index = 1;
	private int size = 10;
	public MemberServlet() {
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
		MemberService memberService = new MemberServiceImpl();
		List<Member> memberList = memberService.pageList(index, size );
		request.setAttribute("memberList", memberList);
		request.getRequestDispatcher("/hotel/member/member.jsp").forward(request, response);
	}
}
