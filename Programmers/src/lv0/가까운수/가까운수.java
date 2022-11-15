package lv0.가까운수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static int solution(int[] array, int n) {
        return Math.min(array[Arrays.stream(array)
                              .map(operand -> Math.abs(n - operand)).boxed()
                              .collect(Collectors.toList())
                              .indexOf(Arrays.stream(array)
                            		  .map(operand -> Math.abs(n - operand))
                            		  .min().orElse(0))],
        		
        		array[Arrays.stream(array)
                           .map(operand -> Math.abs(n - operand)).boxed()
                            .collect(Collectors.toList()).lastIndexOf(Arrays.stream(array)
                           .map(operand -> Math.abs(n - operand)).min().orElse(0))]);
    }
}

public class 가까운수 {

	public static void main(String[] args) {
		int n=20;
		int[] arr = {3,10,28};
		int temp=10000;
		int answer=0;
		for( int a : arr) {
			if(  temp > Math.abs(n-a) ) {
				temp=Math.abs(n-a);
				answer=a;
			}
			else if(temp==Math.abs(n-a)) {
				
				if(answer>a) {
					answer=a;
				}
			}
				
		}
		System.out.println(answer);
		System.out.println(Solution.solution(arr,n));
		
		Arrays.stream(arr)
		  .map(operand -> Math.abs(n - operand))
		  .forEach(a->System.out.println(a));
		
		Arrays.stream(arr)
        .map(operand -> Math.abs(n - operand)).boxed()
        .collect(Collectors.toList())
        .forEach(a-> System.out.println(a));
		
		
		List<Integer> values = List.of(5, 3, 4, 7, 6, 2, 9, 6);
//		ArrayList<Integer> values1 = ArrayList.of(5, 3, 4, 7, 6, 2, 9, 6); 이건안되네
		
	}

}
