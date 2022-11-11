package lv0.대문자와소문자;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
	public static String solution(String my_string) {
		String answer="";
		char[] arr= my_string.toCharArray();
		for(int i=0; i < arr.length ; i++){
			if(Character.isLowerCase(arr[i])){
				arr[i]=Character.toUpperCase(arr[i]);
			}else {
				arr[i]=Character.toLowerCase(arr[i]);
			}
		}
		return new String(arr);
	}
}

class Solution1 {
    public static String solution1(String myString) {
        return myString.chars()
        		.mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
    }
}

public class 대문자와소문자 {

	public static void main(String[] args) {
		String[] arr= {"0","1","2"};
		char[] arr1= {'0','1','2'};
		char char1 = 'a';
		String str1= "cccCCA";
		System.out.println(Character.isUpperCase(char1));

		String result =new String(str1).chars().mapToObj(i -> (char)i)
				.map(a -> Character.isLowerCase(a)==true ? Character.toUpperCase(a):Character.toLowerCase(a) )
				.toArray().toString();
		System.out.println(result);


		System.out.println(Solution.solution(str1));
		System.out.println(String.join("",arr));
		str1.toCharArray();
		str1.split("");
		
		Arrays.stream(arr);
		//char배열은 스트림으로 바로 안됨 Arrays.stream(arr1);
		
		System.out.println(Solution1.solution1(str1));
		System.out.println(String.valueOf(arr1));





	}

}
