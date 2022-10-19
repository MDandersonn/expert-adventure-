package StringTokenizer;

import java.util.StringTokenizer;

public class Test1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("hi nice to meet");
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());
		
		
		StringTokenizer st1 = new StringTokenizer("byeah ah gahs","a");
		System.out.println(st1.nextToken());
		System.out.println(st1.nextToken());
		System.out.println(st1.nextToken());
	}

}
