package model.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import database.connect.OracleConnection;
import model.dto.VisitDTO;



public class VisitDAO {
	private SqlSession session= OracleConnection.getSqlSession();
	
	public int insert(VisitDTO dto) {

		int count= session.insert("VisitMapper.insert",dto);
		return count;
	}

	public void commit() {
		session.commit();
	}

	public void close() {
		
		session.close();
	}

	public void rollback() {
		session.rollback();
	}

	public List<VisitDTO> selectAll() {
		List<VisitDTO> data = session.selectList("visitMapper.selectAll");
		return data;
	}

}
