package lv0.문자열정렬하기1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public static int[] solution(String my_string) {
        return my_string.chars().mapToObj(i->(char)i)
        .filter(Character::isDigit)
        .mapToInt(Character::getNumericValue).sorted()
        .toArray();
     

    }
}


class Solution2 {
    public static int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        String[] arr = my_string.split("");
        for(String str : arr){
            if(Character.digit(str.charAt(0), 10) >= 0){
                answer.add(Integer.parseInt(str));
            }
        }
        Collections.sort(answer);
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
public class 문자열정렬하기1 {
	

	public static void main(String[] args) {
		String str ="a5sd12asd423df1";
		System.out.println(Arrays.toString(Solution.solution(str)));
		System.out.println(Arrays.toString(Solution2.solution(str)));
		System.out.println(Character.digit(4,10));
	}

}
