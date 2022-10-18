package Chapter12_07Exam;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		int[] numbers = {1, -2, 3, -5, 8, -3};
		
		int[] result= Arrays.stream(numbers)
				.boxed()
				.filter(a->(a>=0))
				.mapToInt(Integer::intValue)
				.toArray();
		for(int i=0; i<result.length ;i++) {
        	System.out.print(result[i]+" ");
        }
				

	}

}
