package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neu.service.JobDao;
import com.neu.service.JobDaoImplService;


@WebServlet("/DelJobServlet")
public class DelJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
    public DelJobServlet() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		 response.setCharacterEncoding("utf-8");
		int id =Integer.parseInt( request.getParameter("id"));
		  request.setAttribute("id", id);
		JobDao jobDao = new JobDaoImplService();
		       try {
				int n = jobDao.delete(id);
			if(n==1) {	
			request.getRequestDispatcher("/DelJob.jsp").forward(request, response);
			 	
				
			}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
