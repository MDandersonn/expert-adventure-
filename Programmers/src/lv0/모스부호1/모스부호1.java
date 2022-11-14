package lv0.모스부호1;

import java.util.Arrays;
import java.util.HashMap;

public class 모스부호1 {

	public static void main(String[] args) {
		String str1= ".... . .-.. .-.. ---";
		String[] arr1= str1.split(" ");
		
		HashMap<String , String> map1 = new HashMap<>();
		
		map1.put(".-", "a");map1.put("-...", "b");map1.put("-.-.", "c");map1.put("-..", "d");map1.put(".", "e");
		map1.put("..-.", "f");map1.put("--.", "g");map1.put("....", "h");map1.put("..", "i");map1.put(".---", "j");
		map1.put("-.-", "k");map1.put(".-..", "l");map1.put("--", "m");map1.put("-.", "n");map1.put("---", "o");
		map1.put(".--.", "p");map1.put("--.-", "q");map1.put(".-.", "r");map1.put("...", "s");map1.put("-", "t");
		map1.put("..-", "u");map1.put("...-", "v");map1.put(".--", "w");map1.put("-..-", "x");map1.put("-.--", "y");
		map1.put("--..", "z");
		StringBuilder sb =new StringBuilder();
		for(String s :arr1) {
			sb.append(map1.get(s));
			
		}
		System.out.println(sb.toString());
		
	}

}
