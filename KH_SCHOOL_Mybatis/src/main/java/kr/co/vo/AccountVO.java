package kr.co.vo;

import java.sql.Date;
import java.util.Objects;

public class AccountVO {

	 private int id; //ID NUMBER PRIMARY KEY
	 private String nickname;//NICKNAME VARCHAR2(35) UNIQUE
	 private String email;//EMAIL VARCHAR2(100) UNIQUE
	 private char isAllow; //ISALLOW CHAR(1) DEFAULT('N') CHECK (ISALLOW IN ('N', 'Y'))
	 private Date reqdate; //REQDATE DATE DEFAULT(SYSDATE)
//제약조건은신경안써도됨.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nicknale) {
		this.nickname = nicknale;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getIsAllow() {
		return isAllow;
	}
	public void setIsAllow(char isAllow) {
		this.isAllow = isAllow;
	}
	public Date getReqdate() {
		return reqdate;
	}
	public void setReqdate(Date reqdate) {
		this.reqdate = reqdate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountVO other = (AccountVO) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "AccountVO [id=" + id + ", nickname=" + nickname + ", email=" + email + ", isAllow=" + isAllow
				+ ", reqdate=" + reqdate + "]";
	}
	 
	 

}
