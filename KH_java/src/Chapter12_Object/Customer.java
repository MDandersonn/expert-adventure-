package Chapter12_Object;

public class Customer {
	String name;
	int age;
	String phone;
	String address;

	//기본생성자.
	public Customer() {
		super();
	}

	//매개변수가있는생성자.
	public Customer(String name) {
		super();
		this.name=name;
	}
	
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public void pay() {}
	public void payCancel() {}
	public void phoneChange() {}

	public static void main(String[] args) {
		/*
		 * 생성자: new연산자를 통해 클래스를 인스턴스로 만들때 초기값을 전달하여 멤버변수에 설정하는 메서드
			생성자는 클래스 이름과 동일해야한다.
			생성자는 메서드와 유사하나 반환값이 없다.
			생성자를 정의하지 않으면 기본 생성자가 기본으로 구현되어 사용된다.
			생성자를 정의하면 기본 생성자가 자동으로 구현이 안되어 사용할 수 없게 된다. 
			
			
		 */
		
		Customer cs =new Customer();//매개변수가있는생성자를 정의했기때문에 , 기본생성자 작성 필요
		Customer cs1 =new Customer("홍길동");
		System.out.println(cs1.name);
		System.out.println(cs1.age);
		Customer cs2 =new Customer("박정화",32);
		System.out.println(cs2.name);
		System.out.println(cs2.age);
		
		
	}
}





	
