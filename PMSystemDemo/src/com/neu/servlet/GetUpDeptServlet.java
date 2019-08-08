package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.entity.Dept;
import com.neu.service.DeptService;
import com.neu.service.DeptServiceImpl;


@WebServlet("/GetUpDeptServlet")
public class GetUpDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public GetUpDeptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		 response.setCharacterEncoding("utf-8");
		 int id =Integer.parseInt(request.getParameter("id")) ;
		 DeptService deptService= new DeptServiceImpl();
		     try {
				Dept dept = deptService.getById(id);
				request.setAttribute("dept", dept);
				if(dept!=null) {
				
				
				request.getRequestDispatcher("modifyDept.jsp").forward(request, response);
				}	
				
			} catch (Exception e) {
			
				e.printStackTrace();
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}