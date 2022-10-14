package Chapter10_Array;

import java.util.Arrays;

public class DeepCopy {

	public static void main(String[] args) {
		/*
		 * 깊은복사 방법4가지
		 * 
		 * 반복문사용
		 * 
		 * System.arraycopy(...)
		 * 
		 * Arrays.copyOf(..)
		 * 
		 * 배열변수명.clone()
		 * 
		 * 
		 */
		
		int arr1[]= new int[] {1,2,3,4};
		
		//반복문을 사용한 깊은 복사
		int arr2[] = new int[arr1.length];
		for(int i=0; i<arr1.length ;i++) {
			arr2[i]=arr1[i];
		}
		
		//System.arraycopy(...)
		int arr3[]=new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		//Arrays.copyOf(...)
		int arr4[];
		arr4=Arrays.copyOf(arr1,arr1.length);
		//arr1이 가진것들을 다복사하고 초과범위는 0을 더 추가시켜줌
		
		//배열변수명.clone();
		int arr5[] = arr1.clone();
		
		
		
		
		
		

	}

}
