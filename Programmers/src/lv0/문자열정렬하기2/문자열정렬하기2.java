package lv0.문자열정렬하기2;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String str="Bcad";
		str= str.toLowerCase();
		System.out.println(str);
		char[] arr= str.toCharArray();
		Arrays.sort(arr);
		
		System.out.println(new String(arr));
		
	}

}
