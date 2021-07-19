package com.manager.system.config.security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Spring security 用户认证
 * @author cbigd
 *
 */
@Component
public class ExceptionHandler implements AccessDeniedHandler {
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException deniedexception)
			throws IOException, ServletException {
		response.sendRedirect(request.getContextPath()+"/login");
	}
}