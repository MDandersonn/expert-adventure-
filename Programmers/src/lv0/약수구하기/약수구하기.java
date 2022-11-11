package lv0.약수구하기;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}

public class 약수구하기 {

	public static void main(String[] args) {
		ArrayList<Integer> al1 =new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println(Arrays.toString(al1.toArray()));
		
		System.out.println(Arrays.toString(Solution.solution(26)));
		

	}

}
