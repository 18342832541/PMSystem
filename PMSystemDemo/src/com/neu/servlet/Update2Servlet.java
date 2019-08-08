package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.entity.Job;
import com.neu.service.JobDao;
import com.neu.service.JobDaoImplService;

/**
 * Servlet implementation class Update2Servlet
 */
@WebServlet("/Update2Servlet")
public class Update2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Update2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
	    int id =Integer.parseInt( request.getParameter("id"));
	    String ename = request.getParameter("ename");
	    String postType = request.getParameter("postType");
	    String postAllot = request.getParameter("postAllot");
	    JobDao jobDao = new JobDaoImplService();
	    Job job = new Job(id,ename,postType,postAllot);
	     try {
			int n = jobDao.updateAll(job);
			if(n==1) {
				response.sendRedirect(request.getContextPath()+"/GetAllJobServlet");			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
