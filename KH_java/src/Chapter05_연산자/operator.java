package Chapter05_연산자;

public class operator {

	public static void main(String[] args) {
		// ^ : 서로다르면 1 같으면0 
		for(int y=0,z=2; y<=5; y++,z+=2) {
			System.out.println(y+ "/"+z);
		}
		int x=5;
		x= x>3? 10:0; // 3항 연산
		System.out.println(x);
		
		//전위 연산자  : 먼저 증가후 저장(연산실행)
		int a=10;
		int b= ++a;
		System.out.println(a+","+b);
		
		//후위연산자 :저장먼저(연산실행)하고 증가.
		int a1=10;
		int b1= a1++;
		System.out.println(a1+","+b1);
		
		
		int a3=10;
		int b3=20;
		int result =a3<b3? a3++ : 0 ;
		System.out.println(result);
		//11이아닌 10이 결과. 후위연산이기떄문.
		
		int x1=3;
		int y1=2;
		System.out.println("===정수와정수====");
		System.out.println(x1+y1);
		System.out.println(x1*y1);
		System.out.println(x1/y1);
		System.out.println(x1%y1);
		System.out.println("====정수와 실수는 실수로 출력된다. =======");
		double x2=3.0;
		System.out.println(x2+y1);
		System.out.println(x2*y1);
		System.out.println(x2/y1);
		System.out.println(x2%y1);
		System.out.println("=====실수와실수 ======");
		double y2= 2.0;
		System.out.println(x2+y2);
		System.out.println(x2*y2);
		System.out.println(x2/y2);
		System.out.println(x2%y2);
	
	}

}
