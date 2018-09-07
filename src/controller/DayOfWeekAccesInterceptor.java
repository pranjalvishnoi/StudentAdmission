package controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekAccesInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion "+handler.getClass());
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle "+modelAndView.getViewName());
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar cal= Calendar.getInstance();
		int dayOfWeek=cal.get(cal.DAY_OF_WEEK);
		System.out.println("preHandle " +dayOfWeek);
		System.out.println("preHandle "+request.getAttribute("studentName"));
		if(dayOfWeek==1)
		{System.out.println(dayOfWeek);
			response.getWriter()
.write("closed");	
			return false;}
			
		// TODO Auto-generated method stub
		return true;
	}

}
