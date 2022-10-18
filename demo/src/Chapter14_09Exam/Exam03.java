package Chapter14_09Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exam03 {
	public static void main(String[] args) {
		int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
		ArrayList<Integer> arr= new ArrayList<>();
		Iterator<Integer> i1 = arr.iterator();//배열은 이터레이터가 안된다.
		int sum=0;
		for(int i=0 ; i<A.length;i++) {
			if(A[i]>=50) {
				sum= sum +A[i];
				
			}
		}
		System.out.println(sum);
		
		int result=Arrays.stream(A)
//		.boxed()
		.filter((a)->a>=50)
		.sum();
//		.mapToInt(Integer::intValue)
//		.toArray()
		System.out.println(result);
		
	}

}
