package lv0.자릿수더하기;


import java.util.Arrays;

class Solution {
    public static int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}

public class 자릿수더하기 {

	public static void main(String[] args) {
		System.out.println(Solution.solution(1234));

	}

}
