package com.neu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.EmplDao;
import com.neu.dao.EmplDaoImpl;
import com.neu.entity.Empl;

/**
 * Servlet implementation class GetAllEmpsServle
 */
@WebServlet("/GetAllEmpsServle")
public class GetAllEmpsServle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetAllEmpsServle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int pageSize = 5;
		int pageNum = 1;
		String num = request.getParameter("pageNum");
		if (num != null) {
			pageNum = Integer.parseInt(num);

		}
		EmplDao emplDao = new EmplDaoImpl();

		try {
			List<Empl> empls = emplDao.getPaged(pageSize, pageNum);

			request.setAttribute("empls", empls);
			int count = emplDao.count();
			int page = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;

			request.setAttribute("page", page);
			request.setAttribute("pageNum", pageNum);
			request.getRequestDispatcher("/emplist.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
