package model.dao;
import org.apache.ibatis.session.SqlSession;

import database.connect.OracleConnection;
import model.dto.VisitDTO;


public class VisitDAO {
	private SqlSession session= OracleConnection.getSqlSession();
	
	public int insert(VisitDTO dto) {
//		원래는 String context
		
//		오라클연결해서 
//		String res= session.selectOne("visitMapper.connectTest");
//		System.out.println(res);
//		return 0;
		
		
		
//		전달해주는게 context
//		int count= session.insert("visitMapper.insert",context);
//		return count;
		
		int count= session.insert("visitMapper.insert",dto);
		return count;
	}

	public void commit() {
		session.commit();
	}

	public void close() {
		session.rollback();
	}

	public void rollback() {
		session.close();
	}

}
