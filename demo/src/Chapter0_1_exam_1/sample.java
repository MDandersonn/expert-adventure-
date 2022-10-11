package Chapter0_1_exam_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class sample {
	enum CoffeeType{
		Americano,
		Iceame,
		Cafelatte;
		
	}
	
	
	static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.Americano, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeType.Iceame, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.Cafelatte, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }
	
	public static void main(String[] args) {
		String a= (13%2==0) ? "짝수": "홀수";
		System.out.println(a);
		
		String j ="881120-1068234";
		String r1=j.substring(7);
		System.out.println(r1);
		
		a = "a:b:c:d";
		String aa=a.replaceAll(":", "#");
		System.out.println(aa);
		
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력
        myList.sort(Comparator.naturalOrder());
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);
        
        ArrayList<String> list = new ArrayList<>(Arrays.asList("life","is","so"));
        
        StringBuilder b1 = new StringBuilder();
        for(String word : list) { 
        	b1.append(word);
        	b1.append(" ");
        }
        System.out.println(b1);
        
        String r2 = String.join(" ", list);
        System.out.println(r2);
        
        
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        
        int r3=grade.remove("B");
        System.out.println(r3);
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
        
        HashSet<Integer> h1 = new HashSet<>(numbers);
        System.out.println(h1);
        ArrayList<Integer> g1 = new ArrayList<>(h1);
        System.out.println(g1);
        
        printCoffeePrice(CoffeeType.Americano);  // "가격은 3000원 입니다." 출력
       // printCoffeePrice(99);  // NullPointerException 발생
        
	}

}
