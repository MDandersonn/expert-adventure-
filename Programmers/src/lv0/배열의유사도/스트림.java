package lv0.배열의유사도;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public static int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList())
        		.contains(s)).filter(b -> b).count();
    }
}
public class 스트림 {
	public static void main(String[] args) {
		String[] s1 = {"a","b","c","f"};
		String[] s2 = {"b","e","d","f"};
		System.out.println(Solution.solution(s1,s2));
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("a","B","C")) ;
		System.out.println(arr.contains("a"));
	}

}
