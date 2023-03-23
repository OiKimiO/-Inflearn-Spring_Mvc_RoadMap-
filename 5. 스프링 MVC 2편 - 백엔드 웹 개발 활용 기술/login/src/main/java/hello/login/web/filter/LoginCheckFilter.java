package hello.login.web.filter;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.PatternMatchUtils;

import hello.login.SessionConst;

@Slf4j
public class LoginCheckFilter implements Filter {

	private static final String[] whitelist = {"/",
											   "/members/add",
											   "/login",
											   "/logout",
											   "/css/*"};

	@Override
	public void doFilter(ServletRequest request, 
						 ServletResponse response, 
						 FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String requestURI = httpRequest.getRequestURI();
		
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		try {
			log.info("인증 체크 필터 시작 {}", requestURI);
			
			if(isLoginCheckPath(requestURI)) {
				log.info("인증 체크 로직 실행 {}",requestURI);
				HttpSession session = httpRequest.getSession(false);
				
				if(session == null || 
				   session.getAttribute(SessionConst.LOGIN_MEMBER) == null) {
					log.info("미인증 사용자 요청 {}", requestURI);
					
					// 로그인으로 redirect
					// 로그인 전 RedirectURL을 기억
					httpResponse.sendRedirect("/login?redirectURL="+requestURI);
					
					// 여기가 중요, 미인증 사용자는 다음으로 진행하지 않고 끝
					return;
				}
			}
			
			chain.doFilter(request, response);
		}catch(Exception e) {
			// 예외 로깅 가능하지만, 톰캣까지 예외를 보내주어야 함
			throw e;
		}finally {
			log.info("인증 체크 필터 종료 {}",requestURI);
		}
	}

	/** 
	 * 화이트 리스트의 경우 인증 체크 X
	 * */
	private boolean isLoginCheckPath(String requestURI) {
		return !PatternMatchUtils.simpleMatch(whitelist, requestURI);
	}
	
}
