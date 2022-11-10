package Test;

import java.util.Calendar;

public class ReturnTest {
	public static int method1() {
		int i=0;
		while(i<20) {
			
			if(i==10) {
				return 10;
			}
			i++;
			System.out.println("출력: "+i);
		}
		return 100;
			
	}

	public static void main(String[] args) {
		System.out.println(method1());
		//리턴이 break역할을 할 수 있다.
		System.out.println(Math.sqrt(10));
		//package java.lang; 패키지는 자동으로 임포트되서 위와같이  Math 클래스를 바로 쓸수 있는것
		

	}

}
