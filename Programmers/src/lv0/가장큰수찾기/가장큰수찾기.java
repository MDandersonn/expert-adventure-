package lv0.가장큰수찾기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.Collectors;

class Solution1 {
    public static int[] solution1(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int index = list.indexOf(max);
        return new int[] {max, index};
    }
}

class Solution {
    public static int[] solution(int[] array) {
        ArrayList<Integer> al1 =  (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());
        
        Arrays.sort(array);
        int[] answer = new int[2];
        answer[0]=array[array.length-1];
        answer[1]=al1.indexOf(answer[0]);
        
        return answer;
    }
}

public class 가장큰수찾기 {

	public static void main(String[] args) {
		int[] arr = {1,8,3};
		String str="123123";
		str.length();
		System.out.println(Arrays.toString(Solution.solution(arr)));
		System.out.println(Arrays.toString(Solution1.solution1(arr)));

	}

}
