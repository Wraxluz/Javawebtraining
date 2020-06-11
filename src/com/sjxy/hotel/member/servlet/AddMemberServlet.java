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
import com.sjxy.hotel.member.service.impl.MemberServiceImpl;;

@WebServlet("/addMember.do")
public class AddMemberServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AddMemberServlet() {
		super();
	}
	
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
		
		String me_name = request.getParameter("me_name");
		String me_sex = request.getParameter("me_sex");
		String me_pwd = request.getParameter("me_pwd");
		Integer me_phone = Integer.valueOf("me_phone");
		String me_addr = request.getParameter("me_addr");
		String me_email = request.getParameter("me_email");
		Integer me_inte = Integer.valueOf("me_inte");
		String me_level = request.getParameter("me_level");
		if (me_level.trim()=="") {
			me_level="普通会员";
		}
		List<Member> member = memberService.findByName(me_name);
		if (member==null) {
			int count = memberService.add(me_name,me_sex,me_pwd,me_phone,me_addr,me_email,me_inte);
			if (count==1) {
				request.getRequestDispatcher("member.do").forward(request, response);
			} else {
				request.setAttribute("error", "添加失败，请联系管理员");
				request.getRequestDispatcher("member.do").forward(request, response);
			}
		} else {
			request.setAttribute("error", "该会员已存在，请勿重复添加");
			request.getRequestDispatcher("member.do").forward(request, response);
		}
	}
}
