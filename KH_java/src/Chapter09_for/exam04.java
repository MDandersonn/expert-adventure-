package Chapter09_for;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요: ");
		int n = sc.nextInt();
		System.out.println("두번째 정수값을 입력하세요: ");
		int m = sc.nextInt();
		
		if (n<m){
	
			for(; n<=m;n++) {
				System.out.println(n);
			}
			
		}
		else {
			for(; m<=n;m++) {
				System.out.println(m);
			}
		}
	}
		

}
