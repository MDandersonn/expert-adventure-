package Practice;

class Singleton{
	
	//싱글톤은 단 하나의 객체만을 생성하게 강제하는 패턴이다
	// 클래스를 통해 생성할 수 있는 객체는 Only One, 즉, 한 개만 되도록 만드는 것이 싱글톤이다.

	private static Singleton one;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(one==null) {
			one =new Singleton();
			
		}
		return one;
		
	}
}

public class singletonPatternPrac1 {

	public static void main(String[] args) {
		Singleton s1 =	Singleton.getInstance();

	}

}
