package lv0.짝수홀수개수;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 스트림 {

	public static void main(String[] args) {
		int[] array= {1,1,2,3,4,5};
		int n=1;
		int result = (int) Arrays.stream(array).filter(a -> a%2==0).count();
		int result2 = (int) Arrays.stream(array).filter(a -> a%2==1).count();
		int[] answer =IntStream.of(result,result2).toArray(); 
		System.out.println(Arrays.toString(answer));
		
	}

}
