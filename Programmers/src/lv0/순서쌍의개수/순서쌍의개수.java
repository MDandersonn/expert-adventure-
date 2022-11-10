package lv0.순서쌍의개수;

import java.util.stream.IntStream;

class Solution {
    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}

public class 순서쌍의개수 {

	public static void main(String[] args) {
		System.out.println(Solution.solution(20));
		

	}

}
