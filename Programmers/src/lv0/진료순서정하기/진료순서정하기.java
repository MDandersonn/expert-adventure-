package lv0.진료순서정하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency= {3,76,24};
		Integer[] arr1= Arrays.stream(emergency).boxed().toArray(Integer[]::new);
		Arrays.sort(arr1);
		Integer[] arr2= new Integer[emergency.length];
		for(int i=0; i<emergency.length ;i++) {
			arr2[i]=emergency.length-i;
		}
		
		HashMap<Integer, Integer> hm1 =new HashMap<>();
		for(int i=0; i<emergency.length;i++){
			hm1.put(arr1[i],arr2[i]);
		}
		int[] answer=new int[emergency.length];
		for(int i=0 ; i<emergency.length;i++) {
			answer[i]= hm1.get(emergency[i]);
			
		}
		System.out.println(Arrays.toString(answer));
		
		int[] e= {3,76,24};
		Arrays.stream(e)
			.map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList()).indexOf(i) + 1).toArray();
		
		
		int[] at= new int[5];
		System.out.println(Arrays.toString(at));
		
		
		System.out.println("=".repeat(50));
		 int[] answer1 = new int[emergency.length];
		 
	       for(int i = 0; i < answer1.length; i++){
	    	   
//	            if(answer1[i] != 0) {
//	            	continue;
//	            	}
	            
	            int idx = 1;
	            
	            for(int j = 0; j < answer1.length; j++){
	                if(emergency[i] < emergency[j]){
	                    idx++;
	                    
	                }
	            }
	            answer1[i] = idx;
	        }
	        System.out.println(Arrays.toString(answer1));
		
	        
	        System.out.println("==========================");
	        int[] temp = emergency.clone();
	        // 응급도를 key로, 진료순서를 value로 저장하기 위한 Map(문제_중복원소 없음)
	        Map<Integer, Integer> map = new HashMap<>();

	        // 응급도 max를 찾기 위한 반복문
	        // max값 찾은 후, 해당 인덱스 값은 0으로 변경
	        // (응급도, 진료순위) 쌍을 Map에 저장
	        for(int i=1; i<=temp.length; i++) {
	            int max = temp[0];
	            int maxIdx = 0;           
	            for(int j=1; j<temp.length; j++) {
	               if(temp[j] > max) {max = temp[j];  maxIdx = j;}
	            }

	            map.put(max, i);
	            System.out.println(map);
	            temp[maxIdx] = 0;   
	        }

	        // 원래의 emergency배열에 진료순위를 치환
	        for(int i=0; i< temp.length; i++){
	            emergency[i] = map.get(emergency[i]);
	        }
	        System.out.println(Arrays.toString(emergency));
	        


	        
	        
	}

}
