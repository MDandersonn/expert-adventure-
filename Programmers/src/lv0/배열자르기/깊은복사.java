package lv0.배열자르기;

import java.util.Arrays;

public class 깊은복사 {

	public static void main(String[] args) {
		int[] arr = {155,102,188,105,106};
		int[] arr2=Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		int[] arr3= new int[4-2+1];
		System.arraycopy(arr, 2, arr3, 0, 4-2+1);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4= Arrays.copyOfRange(arr, 1, 3);
		System.out.println(Arrays.toString(arr4));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
