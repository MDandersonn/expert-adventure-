package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VisitController extends HttpServlet{
/*
 * 방명록을 작성할수있는 기능을 제공하기 위한 Servlet
 * 맵핑된 url주소는 /visit이다.
 * 
 * 
 * 사용자가 방명록페이지를 요청하면 방명록을 작성할 수 있는 폼을 담은
 * JSP페이지를 실행하여 제공한다
 * JSP페이지는 /WEB-INF/view/visit.jsp이다
 * 
 */
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		req.getRequestDispatcher("/WEB-INF/view/visit.jsp").forward(req, resp);
	}
	/*
	 * 사용자가 방명록을 작성후 저장 요청을 하면 해당 데이터를
	 * 저장하기 위한 처리를 수행한다.
	 */
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			super.doPost(req, resp);
			String context = req.getParameter("context");
			System.out.println(context);
			VisitService service= new VisitService();
			boolean result= service.add(context);
			if(result) {
				System.out.println("추가 됨 ");
				
			}else {
				System.out.println("추가 안됨");
			}
			
		
		}
}
