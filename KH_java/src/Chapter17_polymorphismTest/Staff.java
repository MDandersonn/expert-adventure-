package Chapter17_polymorphismTest;

public class Staff extends Member {
	


	public Staff(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void remove() {
		System.out.println("글을삭제");
	}

}
