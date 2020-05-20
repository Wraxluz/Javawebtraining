package com.sjxy.hotel.room.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjxy.hotel.room.entity.Room;
import com.sjxy.hotel.room.service.RoomService;
import com.sjxy.hotel.room.service.impl.RoomServiceImpl;

/**
 * Servlet implementation class EditRoomTypeServlet
 */
@WebServlet("/editRoomType.do")
public class EditRoomTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditRoomTypeServlet() {
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
		Room room = roomService.findById(roomId1);
		request.setAttribute("room", room);
		request.getRequestDispatcher("/hotel/roomType/editRoomType.jsp").forward(request, response);
	}

}
