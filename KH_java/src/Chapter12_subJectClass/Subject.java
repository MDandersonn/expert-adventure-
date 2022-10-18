package Chapter12_subJectClass;

public class Subject {
	private String subjectName;
	private int score;
	private String grade;
	
	
	public Subject(String subjectName, int score) {
		super();
		this.subjectName = subjectName;
		setGrade(score);//this 안써도 된다. 쓰는습관이 좋다.
		
	}
	
	public String getSubjectName() {
		return subjectName;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.setGrade(score);
		}
	
	public String getGrade() {
		return grade;
	}
	
	private void setGrade(int score){
		if(score>=0 && score<=100) {
			this.score = score;
			switch((int)(score/10)) {
			case 10:
			case 9:
				this.grade="A";
				break;
			case 8:
				this.grade="B";
				break;
			case 7:
				this.grade="C";
				break;
			case 6:
				this.grade="D";
				break;
			default:
				this.grade="F";
		}
			
		}else {
			this.score=0;
			System.out.println("점수를 다시입력하세요");
		}
		
	}

}
