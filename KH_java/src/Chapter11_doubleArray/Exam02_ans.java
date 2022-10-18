package Chapter11_doubleArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam02_ans {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rand =new Random();
		int n=0;
		while(!(n>=3 && n<=9)) {
			System.out.println("3~9사이의 정수를 입력하세요 열사이즈:");
			n=sc.nextInt();
		}
		int[][] arr = new int[3][];
		
		

		for(int i=0;i<arr.length;i++) {
			int tmp[] =new int[0];
			for(int j=0; j<n;j++) {
				int num=rand.nextInt(99)+1;//0~98 > 1~99
				tmp= Arrays.copyOf(tmp,tmp.length+1);
				tmp[tmp.length-1]=num;
			}
			arr[i]=tmp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].length);
			System.out.println(Arrays.toString(arr[i]));
		}
		
	
	}

}
