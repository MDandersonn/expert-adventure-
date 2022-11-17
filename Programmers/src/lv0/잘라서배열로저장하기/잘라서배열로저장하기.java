package lv0.잘라서배열로저장하기;

import java.util.ArrayList;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		String my_str= "abcdef123";
		int n=3;
		ArrayList<String> al1= new ArrayList<>();		
		for(int i=0; ; i+=n) {
			System.out.println("i+n :  "+ (i+n) );
			System.out.println("스트링길이"+ my_str.length());
			
			if(i+n >= my_str.length()) {
				al1.add(my_str.substring(i, my_str.length()));
				break;
			}
			
			al1.add(my_str.substring(i, i+n));
			System.out.println(al1);
		}

		System.out.println(al1);
		String[] answer = al1.toArray(new String[al1.size()]);
		
		
		String str ="abc";
		System.out.println(str.substring(0,3));
	}

}
