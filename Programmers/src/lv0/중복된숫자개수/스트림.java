package lv0.중복된숫자개수;

import java.util.Arrays;

public class 스트림 {

	public static void main(String[] args) {
		int[] array= {1,1,2,3,4,5};
		int n=1;
		int result = (int) Arrays.stream(array).filter(a -> a==n).count();
		System.out.println(result);

	}

}
