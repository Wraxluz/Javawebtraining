package com.sjxy.hotel.room.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjxy.hotel.room.entity.Room;
import com.sjxy.hotel.room.service.RoomService;
import com.sjxy.hotel.room.service.impl.RoomServiceImpl;

/**
 * Servlet implementation class SelectRoomFloorServlet
 */
@WebServlet("/selectRoomFloor.do")
public class SelectRoomFloorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectRoomFloorServlet() {
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
		String roomFloor = request.getParameter("roomFloor");
		RoomService roomService = new RoomServiceImpl();
		List<Room> roomList = roomService.selectRoomFloor(roomFloor);
		request.setAttribute("roomList", roomList);
		request.setAttribute("floor", roomFloor);
		request.getRequestDispatcher("/hotel/roomType/roomType.jsp").forward(request, response);
	}

}
