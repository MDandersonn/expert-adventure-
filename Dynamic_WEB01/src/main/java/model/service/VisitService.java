package model.service;

import model.dao.VisitDAO;
import model.dto.VisitDTO;

public class VisitService {
	
	public boolean add(VisitDTO dto) {
		VisitDAO dao = new VisitDAO();
//		int count= dao.insert(context);
		int count= dao.insert(dto); //dao가 실제로추가한것 여기서는 로직작성. 
//		DAO가 추가한다음에 결과를 알려줌. 
		if(count==1) {
			dao.commit();
			dao.close();
			return true;
		}
//		1이 아니면
		dao.rollback();
		dao.close();
		return false;
	}

}
