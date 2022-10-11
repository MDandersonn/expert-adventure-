package Chapter7_IF;

public class Switch {

	public static void main(String[] args) {
		int x =2;
		switch (x) {
			case 1:
				System.out.println("1");
//				break;
			case 2:
				System.out.println("2");
//				break;
			case 100:
				System.out.println("100");
//				break;
			default:
				System.out.println("ssss");
		}
		//break없으면 맞는 case부터 밑에꺼 쭉실행
		//default는 생략가능
		
		
	}

}
