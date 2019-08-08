package com.neu.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.entity.DeptTransLogs;
import com.neu.entity.InEmpLogs;
import com.neu.entity.OutEmpLogs;
import com.neu.entity.PersonnelLogs;
import com.neu.entity.PostTransLogs;
import com.neu.service.LogsService;
import com.neu.service.LogsServiceImpl;


@WebServlet("/LogsServlet")
public class LogsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LogsService service = new LogsServiceImpl();
	private SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String logsInfo = request.getParameter("logsInfo");
		
		try {
			switch(logsInfo) {
			case "inEmp":
					doInEmp(request, response);
				break;
			case "outEmp":
				doOutEmp(request, response);
				break;
			case "deptTrans":
				doDeptTrans(request, response);
				break;
			case "postTrans":
				doPostTrans(request, response);
				break;
			case "Personnel":
				doPersonnel(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doInEmp(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int pageSize = 5;
		int pageNum = 1;
		String pageStr = request.getParameter("page");
		if(!("".equals(pageStr) || pageStr == null)) {
			pageNum = Integer.parseInt(pageStr);
		}
		
		Date startTime = f.parse("1900-01-01");
		Date endTime = f.parse("2050-12-31");
		String startDateStr = request.getParameter("startDate");
		String endDateStr = request.getParameter("endDate");
		if(!("".equals(startDateStr) || startDateStr == null)) {
			startTime = f.parse(startDateStr);
			endTime = f.parse(endDateStr);
		}
		
		int count = service.getInEmpLogsPageNum(startTime, endTime);
		int pageSum = count % pageSize == 0?count/pageSize:count/pageSize+1;
		
		List<InEmpLogs> list = service.getInEmpLogs(startTime, endTime, pageSize, pageNum);
		request.setAttribute("list", list);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("pageSum", pageSum);
		
		request.setAttribute("startDate", f.format(startTime));
		request.setAttribute("endDate", f.format(endTime));
		request.setAttribute("show", "inEmp");
		request.getRequestDispatcher("/logsInfo.jsp").forward(request, response);
		
	}

	private void doPersonnel(HttpServletRequest request, HttpServletResponse response) throws Exception {

		int pageSize = 5;
		int pageNum = 1;
		String pageStr = request.getParameter("page");
		if(!("".equals(pageStr) || pageStr == null)) {
			pageNum = Integer.parseInt(pageStr);
		}
		
		Date startTime = f.parse("1900-01-01");
		Date endTime = f.parse("2050-12-31");
		String startDateStr = request.getParameter("startDate");
		String endDateStr = request.getParameter("endDate");
		if(!("".equals(startDateStr) || startDateStr == null)) {
			startTime = f.parse(startDateStr);
			endTime = f.parse(endDateStr);
		}
		
		int count = service.getPersonnelLogsPageNum(startTime, endTime);
		int pageSum = count % pageSize == 0?count/pageSize:count/pageSize+1;
		
		List<PersonnelLogs> list = service.getPersonnelLogs(startTime, endTime, pageSize, pageNum);
		request.setAttribute("list", list);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("pageSum", pageSum);
		
		request.setAttribute("startDate", f.format(startTime));
		request.setAttribute("endDate", f.format(endTime));
		request.setAttribute("show", "Personnel");
		request.getRequestDispatcher("/logsInfo.jsp").forward(request, response);
		
		
	}

	private void doPostTrans(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int pageSize = 5;
		int pageNum = 1;
		String pageStr = request.getParameter("page");
		if(!("".equals(pageStr) || pageStr == null)) {
			pageNum = Integer.parseInt(pageStr);
		}
		
		Date startTime = f.parse("1900-01-01");
		Date endTime = f.parse("2050-12-31");
		String startDateStr = request.getParameter("startDate");
		String endDateStr = request.getParameter("endDate");
		if(!("".equals(startDateStr) || startDateStr == null)) {
			startTime = f.parse(startDateStr);
			endTime = f.parse(endDateStr);
		}
		
		int count = service.getPostTransLogsPageNum(startTime, endTime);
		int pageSum = count % pageSize == 0?count/pageSize:count/pageSize+1;
		
		List<PostTransLogs> list = service.getPostTransLogs(startTime, endTime, pageSize, pageNum);
		request.setAttribute("list", list);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("pageSum", pageSum);
		
		request.setAttribute("startDate", f.format(startTime));
		request.setAttribute("endDate", f.format(endTime));
		request.setAttribute("show", "postTrans");
		request.getRequestDispatcher("/logsInfo.jsp").forward(request, response);
		
	}

	private void doDeptTrans(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int pageSize = 5;
		int pageNum = 1;
		String pageStr = request.getParameter("page");
		if(!("".equals(pageStr) || pageStr == null)) {
			pageNum = Integer.parseInt(pageStr);
		}
		
		Date startTime = f.parse("1900-01-01");
		Date endTime = f.parse("2050-12-31");
		String startDateStr = request.getParameter("startDate");
		String endDateStr = request.getParameter("endDate");
		if(!("".equals(startDateStr) || startDateStr == null)) {
			startTime = f.parse(startDateStr);
			endTime = f.parse(endDateStr);
		}
	
		int count = service.getDeptTransLogsPageNum(startTime, endTime);
		int pageSum = count % pageSize == 0?count/pageSize:count/pageSize+1;
		
		List<DeptTransLogs> list = service.getDeptTransLogs(startTime, endTime, pageSize, pageNum);
		request.setAttribute("list", list);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("pageSum", pageSum);
		
		request.setAttribute("startDate", f.format(startTime));
		request.setAttribute("endDate", f.format(endTime));
		request.setAttribute("show", "deptTrans");
		request.getRequestDispatcher("/logsInfo.jsp").forward(request, response);
		
	}

	private void doOutEmp(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int pageSize = 5;
		int pageNum = 1;
		String pageStr = request.getParameter("page");
		if(!("".equals(pageStr) || pageStr == null)) {
			pageNum = Integer.parseInt(pageStr);
		}
				
		Date startTime = f.parse("1000-01-01");
		Date endTime = f.parse("2150-12-31");
		String startDateStr = request.getParameter("startDate");
		String endDateStr = request.getParameter("endDate");
		if(!("".equals(startDateStr) || startDateStr == null)) {
			startTime = f.parse(startDateStr);
			endTime = f.parse(endDateStr);
		}
	
		int count = service.getOutEmpLogsPageNum(startTime, endTime);
		int pageSum = count % pageSize == 0?count/pageSize:count/pageSize+1;
			
		List<OutEmpLogs> list = service.getOutEmpLogs(startTime, endTime, pageSize, pageNum);
		request.setAttribute("list", list);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("pageSum", pageSum);
	
		request.setAttribute("startDate", f.format(startTime));
		request.setAttribute("endDate", f.format(endTime));
		request.setAttribute("show", "outEmp");
		request.getRequestDispatcher("/logsInfo.jsp").forward(request, response);
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
