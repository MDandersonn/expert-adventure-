package Chapter11_doubleArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Random rand =new Random();
		Scanner sc= new Scanner(System.in);
		int n=0;
		while(!(n>=3 && n<=10)) {
			System.out.print("3~10사이의 정수를 입력하세요 1차배열의 크기:");
			n=sc.nextInt();
		}
	
		int m=0;
		while(!(m>=3 && m<=10)) {
			System.out.print("5~10사이의 정수를 입력하세요 2차배열의 크기:");
			m=sc.nextInt();
		}
		
		int[][] arr=new int[n][m];
		int[] odd= new int[0];
		int[] even= new int[0];		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				//0~89
				int num=rand.nextInt(90)+10;//0~89 > 10 ~99
				arr[i][j]=num;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]%2 !=0) {
					odd=Arrays.copyOf(odd, odd.length+1);
					odd[odd.length-1]=arr[i][j];
				}else {
					even=Arrays.copyOf(even, even.length+1);
					even[even.length-1]=arr[i][j];
				}				
			}
		}
		System.out.println();
		for(int i=0; i<odd.length; i++) {
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		for(int i=0; i<even.length; i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		
		
		int big;
		int small;
		int[] bigArray;
		int[] smallArray;
		if(even.length>=odd.length) {
			bigArray=even;
			smallArray=odd;
		}else {
			bigArray=odd;
			smallArray=even;
		}

		int[] sum= new int[bigArray.length];
		for(int i=0; i<smallArray.length ; i++) {
			sum[i]=smallArray[i]+bigArray[i];
		}

		for(int i=smallArray.length; i<bigArray.length ; i++) {
			sum[i]=2*bigArray[i];
		}
		for(int i=0; i<sum.length; i++) {
			System.out.print(sum[i]+" ");
		}
		System.out.println();
	}

}
