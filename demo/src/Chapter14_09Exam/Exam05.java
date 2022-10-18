package Chapter14_09Exam;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요(2~9): ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.print(n*i+" ");
		}

	}

}
