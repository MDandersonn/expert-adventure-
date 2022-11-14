package lv0.게임365;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 게임365 {

	public static void main(String[] args) {
		int order= 29423;
		String[] arr= String.valueOf(order).split("");
		ArrayList<String> arr2= new ArrayList<>(Arrays.asList(arr));
		int sum= Collections.frequency(arr2, 3) + Collections.frequency(arr2, 9)+ Collections.frequency(arr2, 6);
		
		

	}

}
