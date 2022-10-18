package Chapter11_doubleArray;

import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=0;
		while(!(n>=3 && n<=9)) {
			System.out.println("3~9사이의 정수를 입력하세요");
			n=sc.nextInt();
		}
		int[][] arr = new int[3][n];
		Random rand =new Random();

		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(99)+1;//0~98 > 1~99
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	
	}

}
