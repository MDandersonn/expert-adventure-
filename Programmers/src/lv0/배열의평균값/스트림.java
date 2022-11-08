package lv0.배열의평균값;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 스트림 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		double result =  Arrays.stream(arr).average().orElse(0);
		System.out.println(result);

	}

}
