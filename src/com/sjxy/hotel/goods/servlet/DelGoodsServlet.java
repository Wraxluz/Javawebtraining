package com.sjxy.hotel.goods.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjxy.hotel.goods.service.GoodsService;
import com.sjxy.hotel.goods.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class DelGoodsServlet
 */
@WebServlet("/delGoods.do")
public class DelGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelGoodsServlet() {
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
		String goodsId = request.getParameter("goodsId");
		Integer goodsId1 = Integer.valueOf(goodsId);
		GoodsService goodsService = new GoodsServiceImpl();
		goodsService.delete(goodsId1);
		request.getRequestDispatcher("goods.do").forward(request, response);
	}

}
