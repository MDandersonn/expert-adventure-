package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.BookmarkDTO;
import model.service.BookmarkService;

public class BookmarkController extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		BookmarkService service = new BookmarkService();
		List <BookmarkDTO> data =service.getAll();
		
		req.setAttribute("data", data);
		req.getRequestDispatcher("/WEB-INF/view/bookmark.jsp").forward(req, resp);
	}

	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			super.doPost(req, resp);
			String url = req.getParameter("url");
			String name=req.getParameter("name");

			
			BookmarkDTO dto= new BookmarkDTO();
			dto.setUrl(url);
			dto.setName(name);
			
			BookmarkService service= new BookmarkService();
			boolean result= service.add(dto);//서비스는 추가되서 추가된결과를 알려줌
			
			if(result) {//추가가되었으면
				resp.sendRedirect("./bookmark");//응답에 재접속주소를 담아줌 그래서 재요청될수있게.
//				다시 get요청함
				
			}else {//추가가안되었으면
				System.out.println("추가 안됨");
			}
			
		
		}
}
