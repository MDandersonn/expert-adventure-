package Chapter17_polymorphism;

public class PolymorphismTest {

	public static void main(String[] args) {
		/*
		 * 다형성
		 * -객체지향 프로그램 언어의 3가지 특징( 캡슐화,상속 , 다형성)중 하나
		 * -하나의 객체가 여러 형태를 가지는 객체로 사용할 수 있음을 의미.
		 * -상속을 사용하여 부모 타입으로 부터 파생된 여러 타입의 자식 객체를
		 * 	부모클래스로 다를 수 있게 된다.
		 * -부모클래스가 상속한 멤버필드/메서드에대해서만 다룰수있다.
		 * 자식클래스에 개별적으로 작성된 필드/메서드는 사용할 수 없다.
		 * 
		 *  다운캐스팅
		 *  -부모객체로 사용하고 있는 인스턴스를 자식 객체로 변환하는 것
		 *  -명시적으로 작성하여 캐스팅이 이루어지게 한다.(캐스팅 연산 사용) 
		 *  업캐스팅
		 *  - 자식 객체로 사용하고 있는 인스턴스를 부모 객체로 변환
		 *  -자동으로 변환이 일어남
		 *
		 *
		 */
		
		Person p1 = new Customer("홍길동");//업캐스팅
		Person p2 = new VipCustomer("아무갱");
		p1.setAge(23);
		p2.setAge(30);
		System.out.println(p1);
		System.out.println(p2);
		
		Customer c1 = (Customer)p1; 
		VipCustomer v1 = (VipCustomer)p2; 
		c1.setDiscount(0.05);
		v1.setDiscount(0.15);
		
		System.out.println(c1.getDiscount());
		System.out.println(v1.getDiscount());
		System.out.println(v1.getPoint());
		System.out.println(p1);
		System.out.println(p2);
		
		/*
		 * 배열에 다형성을 적용하여 서로 다른 자식 객체를 담아 사용할 수 있다. 
		 * 
		 */
		Person pArr[] = new Person[4];
		pArr[0] = new Customer("홍길동");
		pArr[1] = new VipCustomer("이장혁");
		pArr[2] = new VipCustomer("박종후");
		pArr[3] = new Customer("장지연");
		
		
		
		
	}

}
