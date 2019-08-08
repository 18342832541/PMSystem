package com.neu.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
 * Servlet implementation class AddServlet
 * @param <Employeeinformation>
 */
@WebServlet("/AddEmpServlet")
public class AddEmpServlet<Employeeinformation> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DateFormat f;
	private String idNumber;
	private Date birthDate;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmplDao emplDao = new EmplDaoImpl();
		
		
		List<Empl> empls = null;
		try {
			 empls =  emplDao.getAll();
			request.setAttribute(" empls",  empls);
			
			request.getRequestDispatcher("/").forward(request, response);
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
