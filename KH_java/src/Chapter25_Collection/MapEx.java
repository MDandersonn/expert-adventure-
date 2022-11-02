package Chapter25_Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapEx {

	public static void main(String[] args) {
		HashMap<String,Double> h1 = new HashMap<>();
		h1.put("국어", 10.0);
		h1.put("수학", 20.0);
		h1.put("영어", 30.0);
		h1.put("과학", 40.0);
		h1.put("사회", 50.0);
		h1.put("체육", 60.0);
		h1.put("미술", 70.0);
		double sum=0;
		
		for(Entry<String, Double> e1 : h1.entrySet()) {
			sum += e1.getValue();
		}
		System.out.println("평균: "+ sum/h1.size());
		System.out.println("총점:" +sum);
		
		for( String a : h1.keySet()){
			System.out.println(h1.get(a));
		}
		System.out.println(h1.keySet());
		
		for( Double a : h1.values()) {
			System.out.println(a);
		}
	}

}
