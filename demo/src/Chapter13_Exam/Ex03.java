package Chapter13_Exam;

import java.util.Scanner;

public class Ex03 {
//자릿수 구하기.
	public static void main(String[] args) {
		System.out.println("자연수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*
		 * 이번에는 양의 정수를 입력 받아
		 *  그 자릿수를 출력하는 프로그램을 작성해 보자. 
		 *  예를 들어 3이 입력되면 1자리수 
		 * 숫자이므로 1, 25가 입력되면 2, 7876이 입력되면
		 *  4를 출력해야 한다.
		 */
		Integer num1= num;
		String str=num1.toString();
//		String str= ""+num;//와 이러면되네..
		
		int len=str.length();
		System.out.println(len);
			
		
		
		
		
	}

}
