package lv0.짝수는싫어요;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public static int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}

public class 짝수는싫어요 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(Solution.solution(10)));

	}

}
