package lv0.합성수찾기;

import java.util.stream.IntStream;

class Solution {
    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }
}

public class 합성수찾기 {

	public static void main(String[] args) {
		int sosu = 0;
        int answer=0;
        for( int i=3;i<=6;i++){
            for(int j=1 ; j<=i; j++){
                if(i%j==0) sosu++;
                if(sosu>=3) {
                	answer++; 
                System.out.println(444); 
                break;}
                
            }
            sosu=0;
        }
        
        System.out.println(answer);
        System.out.println(Solution.solution(6));

	}

}
