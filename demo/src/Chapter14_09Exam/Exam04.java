package Chapter14_09Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam04 {
	
	public static int fiv(int idx) {
		if(idx==0) {
			return 0;
		}
		else if (idx==1) {
			return 1;
		}
		else {
		return fiv(idx-1)+fiv(idx-2);
		}
	}

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n;i++) {
			System.out.print(fiv(i)+" ");
		}
		
		
		
//		int one=0;
//		int two=1;
//		System.out.print(one+" "+two +" ");
//		for(int i=0;i<n-2;i++) {
//			if(i%2==0) {
//				one=one+two;
//				System.out.print(one+" ");
//			}
//			else {
//				two=one+two;
//				System.out.print(two+" ");
//			}
//			
//		}
		
		
//		Integer[] data= {0,1};
//		ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(data));
//		for(int i=0;i<n-2;i++) {
//			arr.add(arr.get(i)+arr.get(i+1));
//		}
//		System.out.println(arr);
		

	}

}
