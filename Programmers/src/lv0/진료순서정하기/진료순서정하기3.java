package lv0.진료순서정하기;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
class Solution {
    public static int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

public class 진료순서정하기3 {

	public static void main(String[] args) {
		int[] emergency= {3,76,24};
		Solution.solution(emergency);
		

	}

}
