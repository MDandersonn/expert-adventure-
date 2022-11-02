package Chapter26_StudentEx;

import java.util.Objects;

public class Subject {
	private String subjectName;
	private int score;
	private String grade;
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		int score1= (int)score;
		this.score = score;
		switch(score1){
		case 90 :
			this.grade = "A"; break;
		case 80 :
			this.grade = "B"; break;
		case 70 :
			this.grade = "C"; break;
		case 60 :
			this.grade = "C"; break;
		default:
			this.grade = "F"; break;	
		}
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return subjectName + ":" + score + " ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(grade, score, subjectName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return Objects.equals(grade, other.grade) && Objects.equals(score, other.score)
				&& Objects.equals(subjectName, other.subjectName);
	}
	
	public Subject(String subjectName, int score) {
		super();
		this.subjectName = subjectName;
		setScore(score);
	}

}
