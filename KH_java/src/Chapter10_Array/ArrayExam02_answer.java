package Chapter10_Array;

import java.util.Scanner;

public class ArrayExam02_answer {

	public static void main(String[] args) {
		int[] arr1= new int[0];
		Scanner sc= new Scanner(System.in);
		int count=0;
		int sum=0;
		double avg;
		int num=0;
		while(!(num ==-1) ) {
			System.out.printf("%d 번째 정수값입력: ",++count);//이게되는구나
			num= sc.nextInt();
			if(num==-1) {
				continue;
			}		
			
			int tmp[] = new int[arr1.length+1];
			for(int i=0; i<arr1.length;i++) {
				tmp[i]=arr1[i];
			}
			arr1=tmp;
			arr1[arr1.length-1]=num;
			sum +=num;
		}
		avg= (double)sum/ arr1.length;
		System.out.printf("총합 : %d\n",sum);
		System.out.printf("평균 : %.2f\n",avg);

		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();

	}

}
