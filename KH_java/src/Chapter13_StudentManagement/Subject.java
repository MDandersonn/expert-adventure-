package Chapter13_StudentManagement;

public class Subject {
	String subjectName;
	int score;
	String grade;
	
	
	public Subject(String subjectName, int score) {
		super();
		this.subjectName = subjectName;
		this.score = score;
		this.grade = setGrade(score);
	}


	private String setGrade(int score){
		if(score>=0 && score<=100) {
			this.score = score;
			switch((int)(score/10)) {
			case 10:
			case 9:
				this.grade="A";
				return "A";
			case 8:
				this.grade="B";
				return "B";
			case 7:
				this.grade="C";
				return "C";
			case 6:
				this.grade="D";
				return "D";
			default:
				this.grade="F";
				return "F";
		}
			
		}else {
			this.score=0;
			System.out.println("점수를 다시입력하세요");
			return "";
		}
		
	}
	
	

}
