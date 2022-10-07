package Chapter0_1_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;


public class sample {
	enum CoffeeType {
	    AMERICANO,
	    ICE_AMERICANO,
	    CAFE_LATTE
	};

	
	static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);

        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

	public static void main(String[] args) {
		if(13%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		String jumin = "881120-1068234";
		System.out.println(jumin.substring(0, 6));
		System.out.println(jumin.substring(7));
		System.out.println(jumin.charAt(7));
		String a = "a:b:c:d";
		String b= a.replace(':', '#');
		
		System.out.println(b);
		System.out.println(a);
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력
        myList.sort(Comparator.naturalOrder());
        System.out.println(myList); // 정렬완료
        
        ArrayList<String> myList1= new ArrayList<>(Arrays.asList("life","is","too","short"));
        String r= String.join(" ",myList1);
        System.out.println(r);
        
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
 
		System.out.println(grade.remove("B"));
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출
        
        HashSet<Integer> s1 = new HashSet<>(numbers);
        System.out.println(s1);
        ArrayList<Integer> s2 = new ArrayList<>(s1);
        System.out.println(s2);
        
        

        System.out.println(CoffeeType.AMERICANO);
        printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력
       
       

	}

}
