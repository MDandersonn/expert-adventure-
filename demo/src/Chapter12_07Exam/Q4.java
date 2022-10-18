package Chapter12_07Exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 1) {  // 홀수이면 
                temp.add(num * 2);  // 2를 곱하여 temp에 담는다.
            }
        }

        // 정수 리스트를 정수배열로 변환한다.
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        
        
        for(int i=0; i<result.length ;i++) {
        	System.out.print(result[i]+" ");
        }
        System.out.println();
        int[] result1= Arrays.stream(numbers)
        			.boxed()
        			.filter(a->(a%2==1))
        			.map(a->a*2)
        			.mapToInt(Integer::intValue)
        			.toArray();
        for(int i=0; i<result1.length ;i++) {
        	System.out.print(result1[i]+" ");
        }
        
    }
}