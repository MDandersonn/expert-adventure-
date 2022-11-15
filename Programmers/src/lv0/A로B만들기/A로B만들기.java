package lv0.A로B만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int solution(String before, String after) {
        return isCheck(getList(before), getList(after)) ? 1 : 0;
    }

    private static boolean isCheck(List<Integer> first, List<Integer> second) {
        for (int i = 0; i < first.size(); i++) {
            if (first.get(i) != second.get(i)) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> getList(String str) {
        return Arrays.stream(str.split(""))
        		
                .collect(Collectors.groupingBy(s -> s))
                .values()
                .stream()
                .map(List::size)
                .collect(Collectors.toList());
    }
}

public class A로B만들기 {

	public static void main(String[] args) {
		String before="olleh";
		String after="hello";
		
		if(before.length() == after.length()) {
			ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(before.split("")));
			ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(after.split("")));
			for(int i=0; i<arr1.size(); i++) {
				if( Collections.frequency(arr2, arr1.get(i))!=Collections.frequency(arr1, arr1.get(i))) {
					System.out.println(0);
					break;
				}
			}
			System.out.println(1);
		}

		System.out.println(Solution.solution(before,after));
		
		 Arrays.stream("olleh".split(""))
         .collect(Collectors.groupingBy(s -> s))//맵타입으로 전환
         .entrySet()//맵의 밸류
         .forEach(a-> System.out.println(a));
//         .stream()
//         .map(List::size)
//         .collect(Collectors.toList());
		 
		 
		 Arrays.stream("olleh".split(""))
         .collect(Collectors.groupingBy(s -> s))//맵타입으로 전환
         .values()//맵의 밸류         
         .stream()
         .map(List::size)
         .forEach(a-> System.out.println(a));
//         .collect(Collectors.toList());
		 System.out.println("=================================");
		 Arrays.stream("olleh".split(""))
         .collect(Collectors.groupingBy(s -> s))//맵타입으로 전환
         .values()//맵의 밸류         
         .stream()
        
		 .forEach(a-> System.out.println(a));
		 System.out.println("=================================");
		 Arrays.stream("hello".split(""))
         .collect(Collectors.groupingBy(s -> s))//맵타입으로 전환
         .values()//맵의 밸류         
         .stream()
        
		 .forEach(a-> System.out.println(a));
		 
		 
	}

}
