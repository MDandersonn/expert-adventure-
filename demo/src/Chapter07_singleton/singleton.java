package Chapter07_singleton;

//한객체만 만들수있게 만드는방법.
class House{
	private static House one;
	private House() {
		
	}
	static House getInstance() {//static메서드에서는 static변수만사용.
		
		if( one==null) {
			one =new House();
		}
		return one;	
	}
}
public class singleton {

	public static void main(String[] args) {
		House h1 = House.getInstance();
		House h2 = House.getInstance();
		System.out.println(h1==h2);

	}

}
