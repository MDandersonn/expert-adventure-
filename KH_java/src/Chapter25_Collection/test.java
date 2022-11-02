package Chapter25_Collection;

import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		HashMap<String,Double> h1 = new HashMap<>();
		h1.put("국어", 10.0);
		h1.put("수학", 20.0);
		h1.put("영어", 30.0);
		h1.put("과학", 40.0);
		h1.put("사회", 50.0);
		h1.put("체육", 60.0);
		h1.put("미술", 70.0);
		System.out.println(h1);
		h1.clear();

		h1.put("과학", 40.0);
		h1.put("사회", 50.0);
		h1.put("체육", 60.0);
		h1.put("미술", 70.0);
		
		System.out.println(h1);

	}

}
