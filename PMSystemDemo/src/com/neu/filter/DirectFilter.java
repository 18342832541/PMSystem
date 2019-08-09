package com.neu.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class DirectFilter
 */
@WebFilter("/*")
public class DirectFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DirectFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String uri = ((HttpServletRequest)request).getRequestURI();
		
		HttpServletRequest request2 = (HttpServletRequest)request;		
		String etips = "etips";
		//排除不拦截的资源
		if(uri.equals(request2.getContextPath()+"/login.jsp") ||
				/*uri.contains(".jpg") ||*/
				uri.equals(request2.getContextPath()+"/login.jsp?etips=etips") ||
				uri.equals(request2.getContextPath()+"/UserLoginServlet")) {
			//放行
			chain.doFilter(request, response);
			return;
		}
		
		HttpSession session = request2.getSession();		
		Object loginer = session.getAttribute("loginer");		
		String url = request2.getContextPath();		
		if(loginer == null) {
			((HttpServletResponse)response).sendRedirect(url+"/login.jsp?etips="+etips);
			return;
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
