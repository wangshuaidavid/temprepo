package cn.enn.rd.HomeEnergyControlLite.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if (!(handler instanceof HandlerMethod)) {
			return super.preHandle(request, response, handler);
		}

		if (this.skipURL(request.getRequestURI())) {
			return super.preHandle(request, response, handler);
		}

		
		System.err.println("interceptor works");
		System.err.println("-----------------------------");

		return true;
	}
	
	
	private boolean skipURL(String uri) {
		String[] skipKeywords = new String[] { "login", "error"}; // url中如果有login		
		boolean toskip = false;
		for (String s : skipKeywords) {
			if (uri.indexOf(s) != -1) {
				toskip = true;
				break;
			}
		}
		return toskip;
	}
	
}
