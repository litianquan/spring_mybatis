package org.fkit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fkit.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/** 
 * 拦截器必须实现HandlerInterceptor接口
 * */ 
public class AuthorizationInterceptor  implements HandlerInterceptor {

	// 不拦截"/loginForm"和"/login"请求
	private static final String[] IGNORE_URI = {"/loginForm", "/login"};
	
	 /** 
     * 该方法将在整个请求完成之后执行， 主要作用是用于清理资源的，
     * 该方法也只能在当前Interceptor的preHandle方法的返回值为true时才会执行。 
     */  
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception exception)
			throws Exception {
		System.out.println("AuthorizationInterceptor afterCompletion --> ");
		
	}
	/** 
     * 该方法将在Controller的方法调用之后执行， 方法中可以对ModelAndView进行操作 ，
     * 该方法也只能在当前Interceptor的preHandle方法的返回值为true时才会执行。 
     */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView mv) throws Exception {
		System.out.println("AuthorizationInterceptor postHandle --> ");
		
	}

	 /** 
     * preHandle方法是进行处理器拦截用的，该方法将在Controller处理之前进行调用，
     * 该方法的返回值为true拦截器才会继续往下执行，该方法的返回值为false的时候整个请求就结束了。 
     */  
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		System.out.println("AuthorizationInterceptor preHandle --> ");
		// flag变量用于判断用户是否登录，默认为false 
		boolean flag = false; 
		//获取请求的路径进行判断
		String servletPath = request.getServletPath();
		// 判断请求是否需要拦截
        for (String s : IGNORE_URI) {
            if (servletPath.contains(s)) {
                flag = true;
                break;
            }
        }
        // 拦截请求
        if (!flag){
        	// 1.获取session中的用户 
        	User user = (User) request.getSession().getAttribute("user");
        	// 2.判断用户是否已经登录 
        	if(user == null){
        		// 如果用户没有登录，则设置提示信息，跳转到登录页面
        		 System.out.println("AuthorizationInterceptor拦截请求：");
        		 request.setAttribute("message", "请先登录再访问网站");
        		 request.getRequestDispatcher("loginForm").forward(request, response);
        	}else{
        		// 如果用户已经登录，则验证通过，放行
        		 System.out.println("AuthorizationInterceptor放行请求：");
        		 flag = true;
        	}
        }
        return flag;
		
	}

}
