package Chapter14_09Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		String str="65,45,2,3,45,8";
		String[] arr= str.split(",");
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			
		
//			int num=Integer.parseInt(arr[i]); //String -> int로바꾸는방법!!!!
			int num=Integer.valueOf(arr[i]);//String  ->Integer로바꾸는방법!!!!
			
			//int >String Integer.toString();
			sum=sum+num;
		}
		System.out.println(sum);
		

	}

}
