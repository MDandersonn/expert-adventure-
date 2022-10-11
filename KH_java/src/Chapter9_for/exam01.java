package Chapter9_for;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		int i=0;
//		int num=0;
//		for (; i<3;i++) {
//			System.out.println("정수값을 입력하세요: ");
//			num=sc.nextInt();
//			if( num<=45 &&num >=1) {
//				break;
//			}
//		}
//		if(i==3) {
//			num=0;
//		}
//		System.out.println(num);
		
		int number=0;
		for(int i=1;i<=3;i++) {
			System.out.println("1~45값 입력");
			int inputNumber=sc.nextInt();
			
			if(inputNumber>=1 && inputNumber<=45) {
				number=inputNumber;
				break;
			}else {
				System.out.printf("입력 기회가 %d번 남았습니다.\n",3-i);
				
			}
		}
		System.out.printf("%d 값이 저장되었습니다 \n",number);
	}

}
