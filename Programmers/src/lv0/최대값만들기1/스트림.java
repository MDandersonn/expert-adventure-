package lv0.최대값만들기1;

import java.util.Arrays;
import java.util.Comparator;

public class 스트림 {

	public static void main(String[] args) {
		int[] arr = {155,102,188,105,106};
		
		arr= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		int result =arr[0]*arr[1];
		System.out.println(Arrays.toString(arr));
		

	}

}
