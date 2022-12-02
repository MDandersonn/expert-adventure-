package kr.co.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.co.vo.AccountVO;

public class OracleConnection1 {
	public static SqlSession getSqlSession() {
		SqlSession sess =null;
		try(InputStream is = Resources.getResourceAsStream("mybatis/mybatis-config.xml")){
			SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(is);
			sess = factory.openSession(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sess;
	}

	public static void main(String[] args) {
		SqlSession sess =OracleConnection1.getSqlSession();
		String result= sess.selectOne("test.hello");
		//반드시하나가 나올땐 selectOne()
		//여러개나올거고 없을수도있다. 그러면 selectList()
		System.out.println(result);
		
		List<AccountVO> reqAccounts =sess.selectList("test.reqAccount");
		for(AccountVO d : reqAccounts) {
			System.out.println(d);
		}

	}
	
	

}
