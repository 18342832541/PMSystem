package com.neu.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.DeptDao;
import com.neu.dao.DeptDaoImpl;
import com.neu.entity.Dept;
import com.neu.service.DeptService;
import com.neu.service.DeptServiceImpl;


@WebServlet("/UpdateDeptServlet")
public class UpdateDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateDeptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String dname = request.getParameter("dname");
		String type = request.getParameter("type");
		int phone = Integer.parseInt(request.getParameter("phone"));
	   String email = request.getParameter("email");   
		String depict = request.getParameter("depict");
	   String  mgr = request.getParameter("mgr");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");  
		  DeptService deptService= new  DeptServiceImpl(); 
		try {
			Date date = f.parse(request.getParameter("date"));
			
			Dept dept = new Dept(id, dname,  type, phone, email, depict, mgr, date);
			
			  int n = deptService.update(dept);
			
			if(n == 1) {
				response.sendRedirect(request.getContextPath()+"/GetAllDeptServlet");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
