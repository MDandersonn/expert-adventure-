package lv0.중앙값구하기;
import java.util.Arrays;

class Solution {
    public static int solution(int[] array) {
        Arrays.sort(array);

        return array[array.length >> 1];
    }
}
public class 중앙값구하기 {

	public static void main(String[] args) {
		int[] arr = {4,3,2,6,5};
		System.out.println(Solution.solution(arr));

	}

}
