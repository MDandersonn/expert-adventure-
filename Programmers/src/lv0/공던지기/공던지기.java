package lv0.공던지기;
import java.util.stream.IntStream;

class Solution {
    public static int solution(int[] numbers, int k) {
        return IntStream.range(1, k).mapToObj(i -> numbers)
        		.flatMapToInt(IntStream::of).toArray()[2 *(k-1)];
    }
}


public class 공던지기 {

	public static void main(String[] args) {
		int[] numbers= {1,2,3};
		int k=3;
		int answer =2*(k-1);
		System.out.println(numbers[answer%numbers.length]);
		int r= Solution.solution(numbers, k);
		System.out.println(r);
		
		System.out.println("=============");
		IntStream.range(1, k).mapToObj(i -> numbers).flatMapToInt(IntStream::of)
		.forEach(a->System.out.println(a));;
		
		

	}

}
