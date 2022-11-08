package lv0.짝수의합;

import java.util.stream.IntStream;

public class 스트림 {

	public static void main(String[] args) {
		int n=10;
		
		int result = IntStream.rangeClosed(0, n)
					.filter(a -> a%2==0)
					.sum();
		System.out.println(result);
		
		IntStream.range(0, n)
					.forEach(System.out::println);
		
		

	}

}
