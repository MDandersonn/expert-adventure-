package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.dto.UserDTO;
import model.service.UserService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		세션이없는경우 새로생성후 반환
		HttpSession session=req.getSession();
//		req.getSession(false);매개변수가false이면  있으면 있는세션찾아서 저장 없으면 null(세션안만듦)
//		session.getAttribute("세션명");
//		session.setAttribute("세션명1", 저장할객체);
//		session.setAttribute("세션명2", 저장할객체);
//		session.setAttribute("세션명3", 저장할객체);
		
//		브라우저에 저장된 세션ID만 동일하면 언제든지 서버에저장되어있는것을 req.getSession으로 찾아오기가능
//		반면, request는 1회성  공유가 안됨.
//		request요청하고 또 request요청하면 유효하지않음
//		session.removeAttribute("세션명1");
//		session.invalidate();  //세션 객체자체를  삭제
//		로그인 -> 세션 생성 (정보저장)
//		로그아웃 -> 세션을 삭제 (invalidate)
		
		if(session.getAttribute("login") !=null) {
//			로그인이 되어있다면 메인페이지로
			resp.sendRedirect(req.getContextPath());
			return;
		}
		Cookie[] cookies =req.getCookies();
		for(Cookie c:cookies) {
//			System.out.println(c.getName()+"|"+c.getValue());
			if(c.getName().equals("remember")) {
				System.out.println("c.get: "+ c.getValue());
				req.setAttribute("remember", c.getValue());
			}
			
		}
		
//									쿠키명 ,쿠키값
//		Cookie cookie =new Cookie("name","value");
		
//		모든 쿠키에는 유효시간이 있다 초단위.
//		localhost:8080/web01/ 안이면 요청할때마다 계속 브라우저가 서버에보낸다

		
//		cookie.setMaxAge(60*60*24);
//		resp.addCookie(cookie);
		
		
		req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId= req.getParameter("userId");
		String password= req.getParameter("password");
		String remember = req.getParameter("remember");
		
//		체크가 되어있는상태로 로그인:on       체크안되어있는상태로로그인 null
		System.out.println(remember);
		
		UserDTO dto =new UserDTO();
		dto.setUserId(userId);
		dto.setPassword(password);
		UserService service= new UserService();
		UserDTO userData = service.login(dto);
		
		Cookie cookie= new Cookie("remember",userId);
		
		
//		로그인성공했을때만 쿠키 만듦
		if(userData !=null) {
			HttpSession session =req.getSession();
//			로그인정보저장
			session.setAttribute("login",true);
//			계정정보저장.
			session.setAttribute("user",userData);
			
			
//			5일 유지 .
			if(remember !=null) {
				cookie.setMaxAge(60*60*24*5);
				resp.addCookie(cookie);
			}else {
//				remember가 null인경우 유효시간만0으로설정해주면 브라우저가 지워줌
				cookie.setMaxAge(0);
			}
			resp.addCookie(cookie);
			resp.sendRedirect(req.getContextPath());
			
		}else {
			req.setAttribute("error", "로그인 실패 다시 시도하세요");
			req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, resp);
		}
				
	}
}
