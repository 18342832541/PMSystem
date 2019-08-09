package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.entity.Job;
import com.neu.service.JobService;
import com.neu.service.JobServiceImpl;

/**
 * Servlet implementation class GetByIdServlet
 */
@WebServlet("/GetByIdServlet")
public class GetByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public GetByIdServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
	       int id = Integer.parseInt(request.getParameter("id"));
	    JobService jobDao = new JobServiceImpl();
	    try {
			Job job = jobDao.getById(id);
			request.setAttribute("job", job);
			request.getRequestDispatcher("/viewJobInfo.jsp").forward(request, response);	
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
