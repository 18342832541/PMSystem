package com.neu.servlet;


import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.entity.Dept;
import com.neu.service.DeptService;
import com.neu.service.DeptServiceImpl;



@WebServlet("/GetAllDeptServlet")
public class GetAllDeptServlet<Dept> extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GetAllDeptServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pageSize=3;
        int pageNum=1;
        String num = request.getParameter("pageNum");
	        if(num !=null) {
	        	pageNum=Integer.parseInt(num);
	
	        }  
             DeptService  DeptService = new DeptServiceImpl();
             List<Dept> list;
			try {
				list = (List<Dept>) DeptService.getPaged(pageSize, pageNum);
				request.setAttribute("list", list);
				int count;
				
					count = DeptService.count();
					int page = count % pageSize == 0?count / pageSize : count/pageSize + 1;
					
					request.setAttribute("page",page);
					request.setAttribute("pageNum",pageNum);
				request.getRequestDispatcher("/deptlist.jsp").forward(request, response);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
 
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
