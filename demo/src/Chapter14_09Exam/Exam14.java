package Chapter14_09Exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam14 {

	public static void main(String[] args) {
		String mos= ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
		
		HashMap<String, String> hm = new HashMap<>();
		hm.put("A", ".-");hm.put("B", "-...");hm.put("C", "-.-.");hm.put("D", "-..");
		hm.put("E", ".");hm.put("F", "..-.");hm.put("G", "--.");hm.put("H", "....");
		hm.put("I", "..");hm.put("J", ".---");hm.put("K", "-.-");hm.put("L", ".-..");
		hm.put("M", "--");hm.put("N", "-.");hm.put("O", "---");	hm.put("P", ".--.");
		hm.put("Q", "--.-");hm.put("R", ".-.");hm.put("S", "...");hm.put("T", "-");
		hm.put("U", "..-");	hm.put("V", "...-");hm.put("W", ".--");	hm.put("X", "-..-");
		hm.put("Y", "-.--");hm.put("Z", "--..");
		ArrayList<String> arr= new ArrayList<>(); 
		String[] wordArr=mos.split("  ");//[word1, word2,".... ."]
		
		for(String word : wordArr) {
			String[] strArr=word.split(" "); //[ "....", "." ]
			for(String ch: strArr) {
				for(String key : hm.keySet()) {
					String value =hm.get(key);
					if(value.equals(ch)) {
						arr.add(key);
					}
				}
			}
			arr.add(" ");
			
		}
		System.out.println(String.join("", arr));
		
		System.out.println(hm.keySet());
	}

}
