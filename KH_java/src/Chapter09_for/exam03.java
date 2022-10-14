package Chapter09_for;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요: ");
		int num= sc.nextInt();
		if(num<=0) {
			System.out.println("1이상의 값을 입력하세요");
		}
		else {
			for(int i=0; i<num; i++) {
				System.out.println(i+1);	
			}
		}

	}

}
