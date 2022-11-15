package lv0.k의개수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public static int solution(int i, int j, int k) {
        return (int) Arrays.stream(IntStream.rangeClosed(i, j)
                        .mapToObj(String::valueOf)
//                        .flatMap(String::lines)
                        .collect(Collectors.joining())
                        .split(""))
        		
                .filter(s -> s.equals(String.valueOf(k)))
                .count();
    }
}

public class k의개수 {

	public static void main(String[] args) {
		int i=1;
		int j=13;
		int k =1;
		int answer=0;
		for(i=i; i<=j;i++) {
			String str= String.valueOf(i);
			for(int n=0; n<str.length() ; n++) {
				if(str.charAt(n) == Character.forDigit(k,10)) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		String[] str1= {"a","B","C"};
		String str2="abcdd";
		
		System.out.println(Solution.solution(1,13,1));

		

	}

}

