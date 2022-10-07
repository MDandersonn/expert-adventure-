package Chapter7_IF;

import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("입력하세요 : ");
			int s =sc.nextInt();
			if (s>=1 && s<=45) {
				System.out.println(s);	
			}
		}
		catch (Exception e){
			System.out.println("error");
			
		}
		
	}

}
