package Chapter11_Stream;

import java.util.Arrays;
import java.util.Comparator;

public class Stream {

	public static void main(String[] args) {
		int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
		int[] result = Arrays.stream(data)//배열을 IntStream으로 생성
				.boxed()//Integer스트림으로 변경 뒤의 메서드사용을위해서.
				.filter((a) -> a%2==0)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.mapToInt(Integer::intValue)//Int스트림으로변경
				.toArray();//Int스트림의 배열인 int[]배열리턴
		
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		

	}

}
