package lv0.배열회전시키기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class 배열회전시키기 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String str ="left";
		
		
		int[] answer =new int[arr.length];
		if(str.equals("left")) {
			answer[0]=arr[arr.length-1];
			for(int i=1 ;i <answer.length; i++) {
				answer[i]=arr[i-1];
				
			}
		}else {
			answer[answer.length-1]=arr[0];
			for(int i=1 ;i <answer.length; i++) {
				answer[i-1]=arr[i];
				
			}
			
		}
		
		
		
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		arr1.add(0, 9);
		
		System.out.println(arr1);
		System.out.println(arr1.get(0));
		arr1.remove(5);
		System.out.println(arr1);
		
	
	}

}
