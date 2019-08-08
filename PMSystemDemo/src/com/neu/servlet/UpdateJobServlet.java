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
@WebServlet("/UpdateJobServlet")
public class UpdateJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateJobServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    request.setCharacterEncoding("utf-8");
		    response.setCharacterEncoding("utf-8");
		    int id =Integer.parseInt( request.getParameter("id"));
		    JobDao jobDao= new JobDaoImplService();  
			try {
				Job	job = jobDao.getById(id);
				request.setAttribute("job", job);
				
				if(job != null) {
					request.getRequestDispatcher("modifyJob.jsp").forward(request, response);
				}
				
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
