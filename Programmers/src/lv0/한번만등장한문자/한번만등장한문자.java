package lv0.한번만등장한문자;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public static String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }


public static int countChar(String str, char ch) {                
    return str.length() - str.replace(String.valueOf(ch), "").length();    
}

}

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String str ="abcabcadc";
		String[] arr=str.split("");
		List<String> al1 = Arrays.asList(arr);
		List<String> al2 = new ArrayList<>();
		String answer="";
		for(int i=0; i<al1.size(); i++) {
			if( Collections.frequency(al1, al1.get(i)) ==1 ){
				al2.add(al1.get(i));
				
			}
		}
		Collections.sort(al2);
		System.out.println(String.join("", al2));
		
		System.out.println(Solution.solution(str));
		
		Arrays.stream(str.split(""))
        .collect(Collectors.groupingBy(s1 -> s1))
        .entrySet().forEach(a -> System.out.println(a));
		
		
		System.out.println("===============");
		String s ="abcabcadc";
		 StringBuilder answer1 = new StringBuilder();

	        HashMap<Character, Integer> searchMap = new HashMap<>();

	        for (int i = 0; i < s.length(); i++) {
	        	searchMap.putIfAbsent(s.charAt(i), 0);
	            searchMap.put(s.charAt(i), searchMap.get(s.charAt(i)) + 1);
	            System.out.println(searchMap);
	        }
	        
	        System.out.println(searchMap);

	        List<Character> once = new ArrayList<>();
	        searchMap.forEach((key, value) -> {
	            if (value == 1)
	                once.add(key);
	        });
	        Collections.sort(once);
	        for (Character ch : once) {
	            answer1.append(ch.toString());
	        }

	       System.out.println(answer1.toString()); 
	       
	       
	       	String answer2 = "";
	        String temp = "";

	        for (int i = 0; i < s.length(); i++) {                                        
	            temp += s.charAt(i); 
	            System.out.println("temp: "+temp);

	            if (Solution.countChar(temp, s.charAt(i)) > 1) {                
	                answer2 = answer2.replaceAll(String.valueOf(s.charAt(i)), "");
	            } else {
	                answer2 += s.charAt(i);            
	            }
	            System.out.println("answer2: "+answer2);
	        }

	        char[] charArr = answer2.toCharArray(); 
	        Arrays.sort(charArr); 
	        String result = new String(charArr); 
	        System.out.println(result);
	        
	         s ="aaabbccd";
	        HashSet<String> set = new HashSet<>();

	        for (int i = 0; i < s.length(); i++) {
	            String replace = s.replace(s.charAt(i) + "", "");
	            System.out.println(replace);
	            if(s.length() - replace.length() == 1){
	                set.add(s.charAt(i)+"");
	            }
	        }
	        ArrayList<String> list = new ArrayList<>(set);
	        Collections.sort(list);
	        System.out.println( String.join("", list));
	        
	        System.out.println(s.replace("a",""));
	        
	        
	        
	        int[] alpha = new int[26];
	        for(char c : s.toCharArray()){
	            alpha[c - 'a']++;
	        }

	        StringBuilder answer3 = new StringBuilder();
	        for(int i = 0; i < 26; i++){
	            if(alpha[i] == 1){
	                answer3.append((char)(i + 'a'));
	            }
	        }
	        System.out.println(answer3.toString()); 


	        
	        Map<String, Integer> countMap = new HashMap<>();

	        for(String string : s.split("")) {
	            countMap.merge(string, 1, Integer::sum);
	            
	        }
	        System.out.println(countMap);

	        List<String> onceString = new ArrayList<>();
	        for(String key : countMap.keySet()) {
	            if(countMap.get(key) == 1) {//밸류가1이면
	                onceString.add(key);//키삽입
	            }
	        }

	        onceString.stream()//리턴문
	                .sorted()
	                .collect(Collectors.joining());   
	        
	        
	        String answer4 = "";

	        Map<String, Integer> map = new HashMap<>();
	        List<String> strList = new ArrayList<>();

	        Arrays.stream(s.split("")).forEach(x -> map.put(x, map.getOrDefault(x, 0)+1));
	        
	        System.out.println(map);
	        map.keySet().stream().filter(x -> map.get(x)==1).forEach(strList::add);
	        Collections.sort(strList);

	        for(String x : strList) answer4+=x;

//	        return answer4;
	        
	    }



}

