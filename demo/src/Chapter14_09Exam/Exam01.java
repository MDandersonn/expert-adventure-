package Chapter14_09Exam;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		String str= "a:b:c:d";
		//a#b#c#d 로 만들라
		String[] result = str.split(":");
		
		System.out.println(Arrays.toString(result));
		System.out.println(String.join("#", result));
		
	}

}
