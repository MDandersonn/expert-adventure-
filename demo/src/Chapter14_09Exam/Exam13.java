package Chapter14_09Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam13 {

	public static void main(String[] args) {
		String str= "0123456789 01234 01234567890 6789012345 012322456789";
		
		String[] strArr=str.split(" ");// ["102380","124124",]
		
		ArrayList<Boolean> al = new ArrayList<>();
		for(int i=0;i<strArr.length;i++) {
			
			int[] arr= Arrays.stream(strArr[i].split(""))//[0,1,2,3,4,5,6,7,8,9]
					.mapToInt(Integer::parseInt)
					.toArray();//int 어레이 //[0,1,2,3,4,5,6,7,8,9]

			if(arr.length !=10) {
				al.add(false);
			}else {//10개
				int[] arr2=Arrays.stream(arr)// int스트림
						.distinct()//중복제거
						.toArray();
				if(arr2.length !=10) {
					al.add(false);
				}else {
					al.add(true);
					
				}
			}
		}
		
		System.out.println(al);
		
		
		
		//int arr을 Integer ArrayLIst로 ?
		int[] ints = {1, 4, 3};
		ArrayList<Integer> intList = (ArrayList<Integer>) Arrays.stream(ints).//int스트림으로
									boxed().//Integer로
									collect(Collectors.toList());//Integer리스트로
		System.out.println(intList);

	}

}
