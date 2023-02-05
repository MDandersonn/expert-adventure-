package listener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpServletRequest;

@WebListener
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		ServletRequestAttributeListener.super.attributeAdded(srae);
		HttpServletRequest req = (HttpServletRequest)srae.getServletRequest();
		System.out.printf("request 속성 Add: %s - %s - %s\n", req.getRequestURI(), srae.getName(), srae.getValue());
	}
	
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		ServletRequestAttributeListener.super.attributeRemoved(srae);
		HttpServletRequest req = (HttpServletRequest)srae.getServletRequest();
		System.out.printf("request속성 Remove: %s - %s - %s\n", req.getRequestURI(), srae.getName(), srae.getValue());
	}
	
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		ServletRequestAttributeListener.super.attributeReplaced(srae);
		HttpServletRequest req = (HttpServletRequest)srae.getServletRequest();
		System.out.printf("request 속성 Replace: %s - %s - %s\n", req.getRequestURI(), srae.getName(), srae.getValue());//이전데이터
		System.out.println("request 속성  New Data: " + req.getAttribute(srae.getName()));//바뀐데이터
	}
}
