package lv0.암호해독;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String solution(String str, int code) {
        String answer="";
		String[] arr= str.split("");
		int i=1;
		while(i*code-1<=str.length()-1) {
			answer += arr[i*code-1];
			i++;
		}
        return answer;
    }
}
public class 암호해독 {

	public static void main(String[] args) {
		
		String str1="dfjardstddetckdaccccdegk";
		int code1= 4;
		
		IntStream.rangeClosed(0, 10).
		Arrays.stream(str1.split("")).filter(null)
		
		
		
		

	}

}
