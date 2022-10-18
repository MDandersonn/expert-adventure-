package Chapter14_09Exam;

import java.util.HashMap;

public class Exam02 {
	 public static void main(String[] args)  {
	        HashMap<String, Integer> a = new HashMap<>();
	        a.put("A", 90);
	        a.put("B", 80);
	        System.out.println(a.get("C"));  // null 출력
	        System.out.println(a.getOrDefault("C", 70));
	    }
}
