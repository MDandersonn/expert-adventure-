package controller.ajax;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@WebServlet("/ajax/imageUpload")
@MultipartConfig
public class ImageUploadController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext sc = req.getServletContext();
		
		Part image = req.getPart("imageUpload");
		String location = req.getParameter("location");
		
		int maxFileSize = Integer.parseInt(sc.getInitParameter("maxFileSize"));
		String permitFileType = sc.getInitParameter("permitFileType");
		String[] permitFileExt = sc.getInitParameter("permitFileExt").split(",");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		String path = "/static/img/" + location + "/" + df.format(new Date());
		String realPath = sc.getRealPath(path);
		File f = new File(realPath);
		if(!f.exists()) {
			f.mkdirs();
		}
		
		if(image.getSize() <= maxFileSize) {
			if(image.getContentType().startsWith(permitFileType)) {
				if(image.getContentType().endsWith(permitFileExt[0]) ||
						image.getContentType().endsWith(permitFileExt[1])) {
					String uuid = UUID.randomUUID().toString();
					image.write(String.join("/", realPath, uuid));
					resp.getWriter().print("{\"imageUrl\": \"" + String.join("/", req.getContextPath(), path, uuid) + "\"}");
					resp.getWriter().flush();
				}
			}
		}
		
	}
}
