package lv0.문자열안에문자열;

import java.util.Arrays;


public class 문자열안에문자열 {

	public static void main(String[] args) {
		String str1 ="ab6CDE443fgh22iJKlmn1o";
		String str2 ="6CD";
		System.out.println(str1.contains(str2));
		if(str1.contains(str2)==true) {
			System.out.println(55);
		}
	}

}
