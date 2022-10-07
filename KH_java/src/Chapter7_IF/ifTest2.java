package Chapter7_IF;

import java.util.Scanner;

public class ifTest2 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("입력하세요 : ");
			int s =sc.nextInt();
			if (s%5==0) {
				System.out.println(s);	
			}
		}
		catch (Exception e){
			System.out.println("error");
			
		}
		
	}
}
