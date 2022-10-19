package Chapter13_StudentManagement;

public class Test {

	public static void main(String[] args) {
		Student st=new Student();
		st.addSubject("국어", 90);
		st.addSubject("수학", 90);
		st.addSubject("영어", 89);
		
		st.showAll();
		
		st.modifyScore("영어", 100);
		st.showAll();
		
		st.removeSubject("국어");
		st.showAll();
		st.removeSubject("국응");
		st.showAll();
	}

}
