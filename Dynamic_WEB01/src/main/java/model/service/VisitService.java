package model.service;

import model.dao.VisitDAO;

public class VisitService {
	
	public boolean add(String context) {
		VisitDAO dao = new VisitDAO();
		int count= dao.insert(context);
		
		if(count==1) {
			return true;
		}
//		1이 아니면
		return false;
	}

}
