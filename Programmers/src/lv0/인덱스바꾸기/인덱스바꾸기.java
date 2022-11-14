package lv0.인덱스바꾸기;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static String solution(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}
public class 인덱스바꾸기 {

	public static void main(String[] args) {
		int num1 =1;
		int num2= 2;
		String str ="hello";
		String r1= str.substring(0,num1);
		String r2= str.substring(num1+1,num2);
		String r3 =str.substring(num2+1);
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		String result = r1 +str.charAt(num2) +r2 +str.charAt(num1) +r3;
		System.out.println(result);
		
		System.out.println(Solution.solution(str,1,2));
	}

}
