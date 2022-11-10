package lv0.숨어있는숫자의덧셈1;

import java.util.Arrays;

class Solution {
    public static int solution(String myString) {
        return myString.chars().mapToObj(i -> (char) i)
        		.filter(Character::isDigit)
        		.mapToInt(Character::getNumericValue).sum();
        //String을 IntStream으로 바꾼후 char로 형변환,
    }
}

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		int answer=0;
		String str="0aAb1B2cC34oOp";
		String[] arr = str.split("");
		for(int i=0; i<arr.length; i++) {
			if('0'< arr[i].charAt(0) && arr[i].charAt(0)<='9') {
				answer += Character.getNumericValue(arr[i].charAt(0));
			}
			
		}
		System.out.println(answer);
		
		System.out.println((Solution.solution(str)));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('1'));
		System.out.println(String.valueOf('1'));
		int[] arr1 =str.chars().toArray(); //String을 intStream으로바꿔는거
		System.out.println(Arrays.toString(arr1));
	}

}
