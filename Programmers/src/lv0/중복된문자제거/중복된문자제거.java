package lv0.중복된문자제거;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 중복된문자제거 {
	public static void main(String[] args) {
		String str = "people";
		String[] arr = str.split("");

		StringBuilder sb =new  StringBuilder();
		boolean sw= false;
		for(int i=0; i<arr.length;i++ ) {
			for(int j=0; j<i;  j++) {
				if(arr[i].equals(arr[j]))  sw=true; 
				
			}
			if (sw==false) {
				sb.append(arr[i]);
				
			}
			sw=false;
		}
		System.out.println(sb);
	}

}
