package lv0.외계행성의나이;

import java.util.stream.Collectors;

class Solution {
    public static String solution(int age) {
        return String.valueOf(age).chars()
        		.mapToObj(operand -> String.valueOf((char) (49 + operand)))
        		.collect(Collectors.joining());
    }
}
public class 외계행성의나이 {
	

	public static void main(String[] args) {
		int age =23;
		String str="";
		char[] arr = String.valueOf(age).toCharArray();
		for(int i=0; i<arr.length ;i++) {
			System.out.println((char)(arr[i] - '0'+'a'));
		
		}
		
		System.out.println(Solution.solution(2330948));
		System.out.println("====================");
		System.out.println((int)'a');
		System.out.println((char)97);
		System.out.println((int)'0');
		System.out.println('0'+49);
		System.out.println('0'+'a'-'0');
		
	}

}
