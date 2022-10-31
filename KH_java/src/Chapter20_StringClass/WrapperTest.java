package Chapter20_StringClass;

import java.util.Scanner;

public class WrapperTest {

	public static void main(String[] args) {
		/*
		 * 문자열을 기본자료형으로 변환해주는 클래스
		 * 
		 * 기본자료형을 클래스로 만들어서 클래스처럼 다루어서 사용할 수 있게
		 * 도와주는 클래스
		 * 
		 * Boolean,Byte,Character,Short,Integer,Long,Float,Double
		 * 
		 * 
		 */
		
		String str ="abc";
		Integer inte= 3;
		Character i= 'a';
		boolean bool1 = Boolean.parseBoolean("true");
		byte bt1 = Byte.parseByte("100");
		char ch1 ="가".charAt(0);
		
		//정수형문자열을 입력받아 총합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("공백을 구분자로하는 정수:");
		String input =sc.nextLine();
		String[] strArr = input.split(" ");
		int[] iArr = new int[strArr.length];
		
		int sum=0;
		for(int i=0; i<strArr.length; i++) {
			if ( strArr[i].charAt(0)>='0' && strArr[i].charAt(0)<='9') {
				iArr[i]= Integer.valueOf(strArr[i]);
				sum +=iArr[i];
			}
			
			
			
		}
		
		System.out.println(sum);

	}

}
