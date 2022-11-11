package lv0.가위바위보;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public static String solution(String rsp) {
        return Arrays.stream(rsp.split(""))
        		.map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}
public class 가위바위보 {

	public static void main(String[] args) {
		String str1 ="025";
		System.out.println(Solution.solution(str1));

		

	}

}
