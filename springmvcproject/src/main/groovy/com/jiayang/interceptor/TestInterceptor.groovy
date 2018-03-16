package com.jiayang.interceptor

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView

class TestInterceptor implements HandlerInterceptor{

	@Override
	def boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
				println "prehand"
				//response.setContentType("text/html;charset=UTF-8")
				//response.getOutputStream().write("错误全新不够".getBytes())
		return true;
	}

	@Override
	def  void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
			println "post"
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
				println "aftercomplete"
		
	}

}
