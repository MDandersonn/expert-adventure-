package Chapter9_for;

import java.util.Scanner;

class week{
	static int x;
}

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
		
		if(str.equals("토")) {
			week.x=6;
		}
		else if(str.equals("일")) {
			week.x=0;
		}
		else if(str.equals("월")) {
			week.x=1;
		}
		else if(str.equals("화")) {
			week.x=2;
		}
		else if(str.equals("수")) {
			week.x=3;
		}
		else if(str.equals("목")) {
			week.x=4;
		}
		else if(str.equals("금")) {
			week.x=5;
		}

		int count=week.x;
		for(int i=0; i<week.x;i++) {
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
