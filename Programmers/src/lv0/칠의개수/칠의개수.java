package lv0.칠의개수;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class 칠의개수 {

	public static void main(String[] args) {
		int[] arr = {7,77,17};
		String[] arr1=Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining())
			.split("");
		
		int sum= (int)(Arrays.stream(arr1).filter(x -> x.equals("7")).count());
		

	}

}
