package Chapter17_polymorphismTest;

import java.util.Objects;

public class Member extends Person{

	public Member(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void write() {
		System.out.println("글을쓴다.");
	}
	public void see() {
		System.out.println("글을 본다");
	}
	public void modify() {
		System.out.println("글을 수정한다.");
	}

}
