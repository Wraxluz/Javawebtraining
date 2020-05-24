package com.sjxy.hotel.goods.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjxy.hotel.goods.entity.Goods;
import com.sjxy.hotel.goods.service.GoodsService;
import com.sjxy.hotel.goods.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class AddGoodsServlet
 */
@WebServlet("/addGoods.do")
public class AddGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGoodsServlet() {
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
		GoodsService goodsService = new GoodsServiceImpl();
		
		String goodsName = request.getParameter("goodsName");
		String goodsType = request.getParameter("goodsType");
		String goodsPrice = request.getParameter("goodsPrice");
		Integer goodsPrice1 = Integer.valueOf(goodsPrice);
		String goodsUnit = request.getParameter("goodsUnit");
		String goodsNote = request.getParameter("goodsNote");
		if (goodsNote.trim()=="") {
			goodsNote="无";
		}
		Goods goods = goodsService.findByName(goodsName);
		if (goods==null) {
			int count = goodsService.add(goodsName,goodsType,goodsPrice1,goodsUnit,goodsNote);
			if (count==1) {
				request.getRequestDispatcher("goods.do").forward(request, response);
			} else {
				request.setAttribute("error", "添加失败，请联系管理员");
				request.getRequestDispatcher("goods.do").forward(request, response);
			}
		} else {
			request.setAttribute("error", "该商品已添加，请勿重复添加");
			request.getRequestDispatcher("goods.do").forward(request, response);
		}
	}

}
