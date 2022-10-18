package Chapter14_09Exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam12 {
	public static void main(String[] args) {
		String str= "aaabbcccccca";
		String[] arr = str.split("");//String배열로된다.
		System.out.println(Arrays.toString(arr));
		ArrayList<String> resultList = new ArrayList<>();
		int cnt=1;
		int i=0;
		while(i<arr.length-1) {
			
			if(arr[i].equals(arr[i+1])) {
				cnt++;
				
			}else {
				resultList.add(arr[i]);
				resultList.add(""+cnt);//숫자를 String으로 만들어주는스킬
				cnt=1;
			}
			i++;
			
		}
		if(!arr[arr.length-1].equals(arr[arr.length-2])){
			resultList.add(arr[arr.length-1]+cnt);
		}
				
		System.out.println(String.join("",resultList));
				
		
	}
}
