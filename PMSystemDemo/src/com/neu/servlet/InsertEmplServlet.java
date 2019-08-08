package com.neu.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.EmplDao;
import com.neu.dao.EmplDaoImpl;
import com.neu.entity.Empl;

/**
 * Servlet implementation class InsertEmplServlet
 */
@WebServlet("/InsertEmplServlet")
public class InsertEmplServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertEmplServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		
		String birthDate = request.getParameter("birthDate");
		String idNumber = request.getParameter("idNumber");
		Double sal = Double.valueOf(request.getParameter("sal"));
		String dept = request.getParameter("dept");
		String job = request.getParameter("job");
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date hiredate =  f.parse(request.getParameter("hiredate"));
			
			Empl empl = new Empl(employeeId, name, sex, birthDate, idNumber, dept, job, hiredate, sal);		
			EmplDao emplDao = new EmplDaoImpl();
			int n = emplDao.insert(empl);
			if(n == 1) {
				response.sendRedirect(request.getContextPath()+"/GetAllEmpsServle");
			}		
			
		} catch (Exception e) {
			
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
