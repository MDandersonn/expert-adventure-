package Chapter10_Array;

import java.util.Random;

public class ArrayExam01 {

	public static void main(String[] args) {
		//random class
		
		System.out.println("=================");
		Random rand = new Random();
		int num = rand.nextInt(5);// 5미만값 랜덤 0~4까지.
//		System.out.println(num);
		
		//배열의 크기가 0인 정수배열을 생성후 난수를 사용하여 0~100까지의 임의값을 
		//생성후 배열에 추가한다.
		//총6개의 정수값을 추가하도록한다.
		
		int arr1[]=new int[0];
		Random rand1 = new Random();
		int tmp[] = new int [6];
		for(int i=0; i<tmp.length ;i++) {
			int num1 = rand1.nextInt(101);
			if(num1%2!=0) {
				tmp[i]=num1;
			}else {
				i--;
				continue;
			}
		}
		arr1=tmp;
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		

	}

}
