package Chapter15_Inherit;

public class Student extends Person{
	private String school;
	private int year;
	public Student(String school) {
		super("아무개");// 부모클래스의 생성자가먼저만들어져야 자식생성자를 만들수있음
		super.name="ㅇㅇ"; //부모의 메서드나 부모의 멤버변수에 접근가능.
		
	}
	/*
	 * 메서드오버라이드
	 * 기존 부모클래스가 가지고있는 메서드를 자식에서 재정의해서 사용하는 것.
	 * 기존 부모에 정의한 메서드명,매개변수타입,개수, 반환타입까지 동일해야 한다.
	 * @Override 어노테이션을 작성. 오타를확인할 수 있다. 
	 * 
	 * 접근제한자는 부모의 접근제한자보다 같거나 넓은 범위로 작성해야한다.???
	 * 
	 * 예외처리: 부모보다 같거나 좁은범위 또는 적은 수의 예외처리여야한다.
	 * final키워드가 사용된 메서드에 대해서는 오버라이드를 할 수없다.
	 * 
	 * 
	 */
	@Override
	public void addAge() {
		super.addAge();
		this.year++;
	}

}
