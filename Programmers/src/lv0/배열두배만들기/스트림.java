package lv0.배열두배만들기;

import java.util.Arrays;

public class 스트림 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] result=Arrays.stream(arr).map(a->2*a).toArray();
		System.out.println(Arrays.toString(result));
		System.out.println(arr.length);
		String b="aaas";
		System.out.println(b.length());
		

	}

}
