package com.neu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.entity.Job;
import com.neu.service.JobDao;
import com.neu.service.JobDaoImplService;

/**
 * Servlet implementation class GetAllJobServlet
 */
@WebServlet("/GetAllJobServlet")
public class GetAllJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetAllJobServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pageSize=3;
        int pageNum=1;
        String num = request.getParameter("pageNum");
	        if(num !=null) {
	        	pageNum=Integer.parseInt(num);
	
	        }  
          JobDao jobDao = new JobDaoImplService();
	  try {
		List<Job>  list= jobDao.getPaged(pageSize, pageNum);
		request.setAttribute("list", list);
		int count = jobDao.count();
		int page = count % pageSize == 0?count / pageSize : count/pageSize + 1;
		
		request.setAttribute("page",page);
		request.setAttribute("pageNum",pageNum);
		request.getRequestDispatcher("/joblist.jsp").forward(request, response);
		
	} catch (Exception e) {
	
		e.printStackTrace();
	}	
		
		
		
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
