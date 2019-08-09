package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neu.service.DeptService;
import com.neu.service.DeptServiceImpl;



@WebServlet("/DeleteDeptServlet")
public class DeleteDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DeleteDeptServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);
       DeptService deptService= new  DeptServiceImpl(); 
		
		 
		try {
			int n = deptService.delete(id);
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
