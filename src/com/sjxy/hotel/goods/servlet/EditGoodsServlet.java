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
import com.sjxy.hotel.room.entity.Room;
import com.sjxy.hotel.room.service.RoomService;
import com.sjxy.hotel.room.service.impl.RoomServiceImpl;

/**
 * Servlet implementation class EditGoodsServlet
 */
@WebServlet("/editGoods.do")
public class EditGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditGoodsServlet() {
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
		Goods goods = goodsService.findById(goodsId1);
		request.setAttribute("goods", goods);
		request.getRequestDispatcher("/hotel/goods/editGoods.jsp").forward(request, response);
	}

}
