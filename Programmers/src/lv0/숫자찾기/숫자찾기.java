package lv0.숫자찾기;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num=232443;
		int k=4;
		
		char[] arr= String.valueOf(num).toCharArray();
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]-'0'==k) {
				System.out.println(i);
				
			}
		}
		System.out.println("+=========================");
		System.out.println('1'+0);
		System.out.println('1'-'0');
		System.out.println('1'==49);
		System.out.println((int)'1');
		String str="asd3aksd";
		System.out.println(str.indexOf(3));
		
		
	}

}
