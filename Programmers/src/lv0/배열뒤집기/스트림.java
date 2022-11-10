package lv0.배열뒤집기;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 스트림 {
    public static int[] solution(int[] numList) {
    	List<Integer> list1= Arrays.stream(numList).boxed().collect(Collectors.toList());
    	Collections.reverse(list1);

    	return list1.stream().mapToInt(Integer::intValue ).toArray();
    }

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int[] answer=new int[arr.length];
		for(int i=arr.length-1, j=0; i>=0 ; i--,j++){
			answer[j]=arr[i];
		}
		
		System.out.println(Arrays.toString(solution(arr)));
	}

}
