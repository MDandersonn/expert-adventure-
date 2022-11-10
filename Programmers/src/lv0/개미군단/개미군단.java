package lv0.개미군단;

class Solution {
    public static int solution(int hp) {
        int answer=0;
        answer = hp/5+ (hp%5/3)+ hp%5%3;
       
        return answer;
    }
}
public class 개미군단 {

	public static void main(String[] args) {
		System.out.println(Solution.solution(23));

	}

}
