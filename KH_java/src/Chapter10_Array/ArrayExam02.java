package Chapter10_Array;

import java.util.Scanner;

public class ArrayExam02 {

	public static void main(String[] args) {
		int[] arr= new int[0];
		
		Scanner sc=new Scanner(System.in);

		for(int i=0; ;i++) {
			System.out.print((i+1)+"번째 정수값 입력 : ");
			int num =sc.nextInt();
			if(num==-1) {
				break;
			}
			int[] tmp= new int[arr.length];
			for(int j=0; j<arr.length;j++) {
				tmp[j]=arr[j];
			}//arr값들을tmp에 다옮겨놓기
			arr= new int[arr.length+1];//arr을  1칸늘려서 재정의
			for(int k=0; k<arr.length-1;k++) {
				arr[k]=tmp[k];
			}//tmp값들을 arr에 다옮겨
			arr[i]=num; //1칸늘린 arr의 끝값추가
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum= sum + arr[i];
		}
		
		System.out.println("총합: "+sum);
		System.out.println("평균: "+ (double)sum/(arr.length) );

	}

}
