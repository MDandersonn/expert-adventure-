package Chapter12_subJectClass;

public class subjectTest {

	public static void main(String[] args) {
		Subject s1 = new Subject("math",85);
		System.out.println(s1.getGrade());
		s1.setScore(70);
		System.out.println(s1.getGrade());
		s1.setScore(101);
		System.out.println(s1.getScore());
		System.out.println(s1.getGrade());

	}

}
