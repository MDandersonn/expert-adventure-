package Chapter10_Array;

import java.util.Scanner;

public class ArrayExam_answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=5;
		int arr1[]=new int[size];
		
		for (int i=0; i<size;) {//i++을 for문에 주지않았다.
			System.out.println("1~10사이의 정수입력: ");
			int num= sc.nextInt();
			if (num>=1 && num<=10) {
				boolean isDuplicate=false;
				for(int j=0; j<i; j++) {
					if(arr1[j]==num) {
						isDuplicate=true;
						break;
					}
				}
				if(!isDuplicate) {//isDuple이 false이면
					arr1[i]=num;
					i++;
				}else {
					System.out.println("이미 초기화한 값입니다.");
				}
			}else {
				System.out.println("값을 다시 확인해서 입력하세요");
			}
		}
		for (int i=0; i<size ;i++) {
			System.out.printf("%d\t",arr1[i]);
		}
		

	}

}
