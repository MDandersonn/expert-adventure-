package Chapter6_exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			
			System.out.println("영문자를입력하세요 :");
			String str =sc.nextLine();
			
			String a =str.toUpperCase();
			if(a.equals("END")) {
				break;
			}
			System.out.println(a);
		}
		
				

	}

}
