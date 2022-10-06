package Chapter04_출력;

public class Print {

	public static void main(String[] args) {
		/**
		 * printf()는 print()와 동일한 기능+ 출력 형식(포맷)지정
		 * %s:문자열
		 * %d:정수
		 * %c:문자
		 * %f실수
		 * %5d 5칸확보 오른쪽정렬
		 * %-5d 5칸확보 왼쪽정렬
		 * %.2f :소수점아래2자리까지만표시
		 */
		System.out.printf("%s/%d","ABCD", 1234);
		System.out.println("----------");
		int age =10;
		System.out.println("나는 "+ (age+ 1) +"세");
		System.out.println("나는 "+ age + 1 +"세");
		System.out.println(age + 1 +"세");
		/**
		 * 왼쪽부터 오른쪽방향으로 순서대로연산하는데 나는과 age의 연산으로 문자열이되고 1과결합하니까 문자열 101세 가 되는거
		 * 3번째꺼는 age와 1의 결합이니까 덧셈이 먼저시행되고 문자열결합이 되서 제대로 나오는것.
		 * 괄호를 잘이용하자
		 */
		double tall=123.14;
		float tall1=123.44f;
		System.out.println("나는" + tall + "입니다");
		System.out.println("나는" + tall1 + "입니다");
		
		System.out.printf("나는 %f 입니다\n",tall);
		System.out.printf("나는 %f 입니다\n",tall1);
		System.out.printf("나는 %.2f 입니다\n",tall1);
		System.out.printf("나는 %.2f 입니다\n",tall1);
		System.out.printf("나는 %.2f 입니다\\n",tall1);
		/**
		 * \t
		 * \n
		 * \\ 특수문자 사용시 백슬러시를 넣고 특수문자를 넣어야함
		 * \'
		 * \"
		 *   유니코드표시할때
		 */
		

	}

}
