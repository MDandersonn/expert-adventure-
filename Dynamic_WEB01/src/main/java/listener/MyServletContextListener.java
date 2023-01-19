package listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContextListener.super.contextInitialized(sce);
		System.out.println("컨텍스트 객체가 생성되었습니다.");
		ServletContext context =sce.getServletContext();
		context.setAttribute("hello","안녕하세요");
//		
		//아래와같이해도된다.
//		sce.getServletContext().setAttribute("hello", "안녕하세요");
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		ServletContextListener.super.contextDestroyed(sce);
		System.out.println("컨텍스트 객체가 소멸되었습니다.");
	}
	
	
	
}
