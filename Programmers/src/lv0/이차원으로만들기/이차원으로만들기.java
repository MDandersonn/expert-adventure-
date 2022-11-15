package lv0.이차원으로만들기;

import java.util.Arrays;

public class 이차원으로만들기 {

	public static void main(String[] args) {
		int n=2;
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		
		int seq=0;
		int[][] answer = new int[arr.length/n][n];
        for(int i=0; i<arr.length/n; i++){
        	System.out.println(i);
        	for(int j=0; j<n; j++) {
        		System.out.println(j);
        		answer[i][j] = arr[seq];
        		seq++;
        	}
        }
		System.out.println(Arrays.toString(answer));

	}

}
