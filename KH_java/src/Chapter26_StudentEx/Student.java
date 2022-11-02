package Chapter26_StudentEx;

import java.util.Objects;

public class Student {
	private String name;
	private int grade;
	private int ban;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ban, grade, name, number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return ban == other.ban && grade == other.grade && Objects.equals(name, other.name) && number == other.number;
	}
	@Override
	public String toString() {
		return name + ": ";
	}
	public Student(String name, int grade, int ban, int number) {
		super();
		this.name = name;
		this.grade = grade;
		this.ban = ban;
		this.number = number;
	}
	

}
