package Test;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String str= "abcde";
		String[] arr=str.split("");
		System.out.println(Arrays.toString(arr));
		String result=null;
		for(int i=str.length()-1 ;i>=0;i--) {
			result += String.valueOf(str.charAt(i));
		}
		
		String resu=null;
		String resu2="";
		System.out.println(result.charAt(0));
		System.out.println(resu);
		System.out.println(result);
		System.out.println(resu2);
		
		System.out.println(resu2.length());
//		System.out.println(resu.length());
		
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
