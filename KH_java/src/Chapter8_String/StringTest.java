package Chapter8_String;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1="Hello";
//		String s2;
		String s3="Hello";
//		System.out.println("Hello라고입력하세요:");
//		s2= sc.nextLine();
//		System.out.println(s1==s2); //참조값다름 false
//		System.out.println(s1.equals(s2)); // 문자열일치 true
		
		System.out.println(s1==s3);// 참조값같다 ???????
		/**
		 * String s1="Hello" 이것을 
		 * 왜냐하면 리터럴(literal) 표기라고 하는데 객체 생성없이
		 *  고정된 값을 그대로 대입하는 방법을 말한다
		 *  리터럴 표기법은 "~~" 라는 문자열을 intern pool 이라는 곳에 저장하고 
		 *  다음에 다시 동일한 문자열이 선언될때는 cache 된 문자열을 리턴한다
		 */
		System.out.println(s1.equals(s3));//문자열일치
		
		String s4 = new String("HI");
		String s5 = new String("HI");
		System.out.println(s4==s5);//참조값다름
		System.out.println(s4.equals(s5)); //문자열일치
	}

}
