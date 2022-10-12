package Chapter10_Array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/**
		 * 배열에 저장된 데이터는 기본값0 으로 초기화되어있기떄문에 별도의 초기화작업이
		 * 필요없다
		 * 정수는 0
		 * 실수는0.0
		 * 불린은 초기값 false
		 * 문자열 최소값 null;
		 */

		int[] arr;
		arr=new int[3];
		int[] arr1= {1,2,3,4};
		System.out.println(arr[1]);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=3*(i+1);
			System.out.println(arr[i]);
		}
		
		int[] arr2= new int[5];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=5-i;
			System.out.println(arr2[i]);
		}
		
		System.out.println("정수를 입력하세요: ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr3= new int[num];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=-1;
			System.out.println(arr3[i]);
		}
		
		System.out.println("=========4번문항=============");
		System.out.println("배열의 크기를 입력하세요: ");
		int num2 = sc.nextInt();
		int[] arr4= new int[num2];
		int num3;
		for(int i=0;i<arr4.length;i++) {
			while(true) {
				int swit=0;
				System.out.println("배열 값 입력값을 입력하세요: ");
				num3 =sc.nextInt();
				for(int j=0;j<i;j++) {
					if(arr4[j]==num3) {
						System.out.println("중복됩니다.다시입력하세요");
						swit=1;
						break;
					}	
				}
				if(swit==0) {
					break;
				}	
			}
			arr4[i]=num3;
		}
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i]+" ");
		}
	}
}
