package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.dao.LoginerDao;
import com.neu.dao.LoginerDaoImpl;
import com.neu.entity.Loginer;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginerDao dao = new LoginerDaoImpl();
		String loginMsg = null;
		try {
			Loginer loginer = dao.getByName(username);
			if(loginer != null) {
				Loginer byAll = dao.getByAll(username, password);
				if(byAll != null) {
					HttpSession session = request.getSession();
					session.setAttribute("loginer", byAll);
					response.sendRedirect(request.getContextPath()+"/main.jsp");
				}else {
					loginMsg = "passwordError";
					response.sendRedirect(request.getContextPath()+"/login.jsp?LoginMsg="+loginMsg);
					return;
				}
			}else {
				loginMsg = "noUser";
				response.sendRedirect(request.getContextPath()+"/login.jsp?LoginMsg="+loginMsg);
				return;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
