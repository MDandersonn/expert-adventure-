package lv0.진료순서정하기;

import java.util.*;

class 진료순서정하기2 {
    static class Emergency implements Comparable<Emergency> {
        int idx;
        int val;
        Emergency (int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
        public int compareTo(Emergency other) {
            return other.val - val;
        }
    }
    public static int[] solution(int[] emergency) {
        Emergency[] arr = new Emergency[emergency.length];
        for (int i = 0; i < emergency.length; ++i) {
            arr[i] = new Emergency(i, emergency[i]);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
        	System.out.println("i:" + i+ " arr[i].idx: " + arr[i].idx);
        	
            emergency[arr[i].idx] = i + 1;
        }
        return emergency;
    }
    
    public static void main(String[] args) {
    	int[] emergency= {3,76,24};
    	System.out.println("=asdasdasdasdad++");
    	System.out.println(Arrays.toString(진료순서정하기2.solution(emergency)));
    	
    	System.out.println("+====================");
    	int[] emergency1= {3,76,24};
    	int len = emergency1.length;
        int[] answer2 = new int[len];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            map.put(emergency1[i], i);
        }

        Arrays.sort(emergency1);

        for (int i = len-1; i >= 0; i--) {
            answer2[map.get(emergency1[i])] = len - i;
        }
        System.out.println(Arrays.toString(answer2));
	}
    
}