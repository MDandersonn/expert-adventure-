package model.service;

import model.dao.UserDAO;
import model.dto.UserDTO;

public class UserService {

	public int add(UserDTO dto) {
		UserDAO dao = new UserDAO();
		
		UserDTO data = dao.selectUser(dto);
		
		if(data == null) {//특정아이디가 없을떄
			int count = dao.insert(dto);
			if(count == 1) {
				dao.commit(); dao.close();
				return 1; //잘 입력되었을때
			}
			dao.rollback(); dao.close();
			return 0;//입력실패
		}
		dao.close();
		return -1;//아이디가 있을때
	}

	public UserDTO login(UserDTO dto) {
		UserDAO dao = new UserDAO();
		UserDTO data =dao.selectUser(dto);
		if(data==null) {
			dao.close();
			return null;
			
		}else {
			if(data.getPassword().equals(dto.getPassword())) {
				dao.close();
				return data;
			}
		}
		dao.close();
		return null;
	}

	public boolean update(UserDTO userData, UserDTO dto, String password) {
		UserDAO dao = new UserDAO();
		
		UserDTO data= dao.selectUser(userData);
		if(data==null) {
			dao.close();
			return false;
			
		}else {
			if(data.getPassword().equals(password)) {
				dto.setUserId(data.getUserId());
				if(dto.getPassword().isEmpty()) {
					dto.setPassword(data.getPassword());//기존패스워드그대로
				}
				int count= dao.update(dto);
				if(count==1) {
					dao.commit(); dao.close();
					return true;
				}
				;
			}
			
		}
		return false;
	}

}
