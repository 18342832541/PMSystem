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


@WebServlet("/AddJobServlet")
public class AddJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddJobServlet() {
        super();
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
		      request.setAttribute("job", job);
		     try {
				int n = jobDao.insert(job);
		if (n==1) {
			response.sendRedirect(request.getContextPath()+"/GetAllJobServlet");
	
		}	
		} catch (Exception e) {
			
				e.printStackTrace();
			}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
