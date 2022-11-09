package lv0.배열원소의길이;

import java.util.Arrays;

class Solution {
	public static int[] solution(String[] strList) {
		return Arrays.stream(strList).mapToInt(String::length).toArray();
	}
}

public class 스트림 {

	public static void main(String[] args) {
		String[] arr= {"we","are","gggs"};
		System.out.println(Arrays.toString(Solution.solution(arr)));

	}

}
