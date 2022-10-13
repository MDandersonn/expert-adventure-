package Chapter9_for_1;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("월: " );
		int month=sc.nextInt();
		System.out.print("시작요일: " );
		sc.nextLine();
		String str=sc.nextLine();
		System.out.print("마지막일자: " );
		int day=sc.nextInt();
		System.out.println();
		System.out.println(month+" 월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int x=0;
		
		if(str.equals("토")) {
			x=6;
		}
		else if(str.equals("일")) {
			x=0;
		}
		else if(str.equals("월")) {
			x=1;
		}
		else if(str.equals("화")) {
			x=2;
		}
		else if(str.equals("수")) {
			x=3;
		}
		else if(str.equals("목")) {
			x=4;
		}
		else if(str.equals("금")) {
			x=5;
		}
		int count=x;
		for(int i=0; i<x;i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=day; i++) {
			System.out.print(i+"\t");
			count++;
			if(count%7==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		
		
		

	}

}
