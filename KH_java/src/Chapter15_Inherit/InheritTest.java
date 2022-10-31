package Chapter15_Inherit;

public class InheritTest {

	public static void main(String[] args) {
		/*상속
		 * 다른 클래스가 가지고 있는 멤버(변수,메서드)들을 
		 * 새로작성하는 클래스에서 직접 만들지 않고 상속을 받아서
		 * 자신의 멤버변수 멤버메서드처럼 사용할 수 있게 만드는 기능.
		 * 부모의 private접근제한자를 사용하는 멤버들은 자식이라해도 접근할 수없다.
		 * 생성자는 상속되지 않는다. 
		 * extends키워드로 상속 받을 수 있는 객체는 오직 1개 뿐이다.
		 * (다중 상속 지원안함) 
		 * 상속관계에서 객체가 생성될때 부모가 먼저 생성된 후 자식이 생성된다.
		 * 자식클래스에서 super키워드를 사용하면 부모에대한 접근으로 사용된다.
		 * 
		 *
		 * 
		 * 상속의 이점
		 * -재사용성이 높아진다
		 * -적은 양의 코드로 새로운 클래스 작성
		 * -코드의 중복을 최소화하고 프로그램의 생산성/유지보수성에 기여함
		 * -공통 기능에 대해서는 상속을 통해 관리하기 떄문에 관리 용이
		 */
		Person p1 = new Person("아무개");
		p1.setAge(33);
		Student s1 = new Student("ass");
		
		System.out.println(p1.toString());

		
		Person p2 = new Person("아무개");
		p2.setAge(33);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
	}

}
