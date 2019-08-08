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
@WebFilter()
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
		String etips = "你不登录，不让你访问内部！请你先登录，谢谢！";
		//排除不拦截的资源
		if(uri.equals(request2.getContextPath()+"/login.jsp")) {
			//放行
			chain.doFilter(request, response);
			return;
		}
		
		HttpSession session = request2.getSession();		
		Object username = session.getAttribute("username");		
		String url = request2.getContextPath();		
		if(username == null) {
			((HttpServletResponse)response).sendRedirect(url+"/login.jsp");
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
