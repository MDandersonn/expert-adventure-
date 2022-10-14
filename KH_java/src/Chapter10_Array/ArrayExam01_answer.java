package Chapter10_Array;

import java.util.Random;

public class ArrayExam01_answer {

	public static void main(String[] args) {
		int arr1[]=new int[0];
		
		Random rand2 = new Random();
		for(int i=0; i<6;i++) {
			int num=rand2.nextInt(101);
			if(num%2==0) {
				continue;
			}
			int size= arr1.length+1;
			int tmp[] =new int[size];//tmp를 arr보다 한칸 더 크게만든다.!!!
			
			for(int j=0;j<arr1.length; j++) {
				tmp[j]=arr1[j]; //arr값을 tmp로 옮긴다.
			}
			arr1=tmp;//tmp를 arr로 바꾸고
			arr1[arr1.length-1]=num; //arr의 끝값을 지정해준다.
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
			
		}
		System.out.println();

	}

}
