package Chapter13_Exam;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * 10 미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9이다. 이들의 총합은 23이다.
			1000 미만의 자연수에서 3의 배수와 5의 배수의 총합을 구하라.
		 */
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=1; i<1000; i++) {
			if(i%3==0) {
				arr.add(i);
			}else if(i%5==0 && !(i%3==0)) {
				arr.add(i);
			}
		}
		int sum=0;
		for(int i=0; i<arr.size();i++) {
			sum=sum+ arr.get(i);
		}
		
		System.out.println(sum);
		
		

	}

}
