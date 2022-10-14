package Chapter09_for;

public class forTest {

	public static void main(String[] args) {
		
		
		int i;
		for(i=5; i<10;i++) {
			System.out.println(i);
		}
		System.out.println(i+"이 되었어요");
		/**
		 * 
for(int i=0 )초기식을 쓸때 for문 안에 선언된 변수는 for문밖에서 사용못함.
그럴때는
int i=0 포문밖에 선언하고
for(i=0; ~)이렇게 초기화하면 for문 밖에서  i변수를 사용가능하다.

		 */
		
		
		int x3=1;
		for(; x3<=3;x3++){ //초기식 생략가능 for문외부에선언,초기화하고
			System.out.println(x3);
		}
/**
 * int x3=1;
for(; x3<=3;x3++){ //초기식 생략가능 for문외부에선언,초기화하고
 */
		
		int x4=1;
		for(;;x4++){ //조건식생략시 무한반복될수있다. break로멈추면된다.
			System.out.println(x4);
			if(x4>5) {
				break;
			}
		}
		
		int x5= 1;
		for(;x5<5;) {
			//증감식 생략하는경우
			System.out.println(x5);
			x5++;
		}
		
		
		for(;;) {
			System.out.println("무한반복");
		}
		
		
		
		
	}

}
