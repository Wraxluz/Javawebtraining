package com.sjxy.hotel.room.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjxy.hotel.room.service.RoomService;
import com.sjxy.hotel.room.service.impl.RoomServiceImpl;

/**
 * Servlet implementation class DelRoomTypeServlet
 */
@WebServlet("/delRoomType.do")
public class DelRoomTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelRoomTypeServlet() {
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
		RoomService roomService = new RoomServiceImpl();
		String roomId = request.getParameter("roomId");
		Integer roomId1 = Integer.valueOf(roomId);
		roomService.delete(roomId1);
		request.getRequestDispatcher("roomType.do").forward(request, response);
	}

}
