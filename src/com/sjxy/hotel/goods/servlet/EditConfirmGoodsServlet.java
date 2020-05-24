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
import com.sjxy.hotel.room.service.RoomService;
import com.sjxy.hotel.room.service.impl.RoomServiceImpl;

/**
 * Servlet implementation class EditConfirmGoodsServlet
 */
@WebServlet("/editConfirmGoods.do")
public class EditConfirmGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditConfirmGoodsServlet() {
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
		String goodsId = request.getParameter("goodsId");
		Integer goodsId1 = Integer.valueOf(goodsId);
		String goodsName = request.getParameter("goodsName");
		String goodsType = request.getParameter("goodsType");
		String goodsPrice = request.getParameter("goodsPrice");
		Integer goodsPrice1 = Integer.valueOf(goodsPrice);
		String goodsUnit = request.getParameter("goodsUnit");
		String goodsNote = request.getParameter("goodsNote");
		
		Goods goods = new Goods();
		goods.setGoods_id(goodsId1);
		goods.setGoods_name(goodsName);
		goods.setGoods_type(goodsType);
		goods.setGoods_price(goodsPrice1);
		goods.setGoods_unit(goodsUnit);
		goods.setGoods_note(goodsNote);
		
		goodsService.update(goods);
		request.getRequestDispatcher("goods.do").forward(request, response);
	}

}
