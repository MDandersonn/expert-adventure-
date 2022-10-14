package Chapter10_Array;

public class arrayCopy {

	public static void main(String[] args) {
		int arr2[]= new int[3];
		arr2[0]=1; arr2[1]=2; arr2[2]=3;
		int[] arr3= arr2;
		
		System.out.println(arr2==arr3);//주소값이 같다.

		arr2[0]=53;
		
		System.out.println(arr3[0]);
		/**
		 * 얕은복사
		 * 	:배열의 참조 주소만을 복사하여 동일한 데이터를 공유하여 사용하게 만드는 복사.
		 * 
		 * 깊은복사
		 * 	:새로운 배열을 생성하여 각 배열마다 다른 참조주소를 사용하여 서로 다른 데이터를 사용하게
		 * 	만드는 복사.
		 * 
		 * 
		 * 
		 */
		//깊은복사
		int[] arr4 =new int[arr3.length];
		for(int i=0; i<arr3.length;i++) {
			arr4[i]=arr3[i];
		}
		
		arr3[1]=20; 
		System.out.println(arr4[1]);//값변화 없다.
		
		/*
		 * 동적배열
		 * 		크기고정된 기존배열을
		 * 		새로운 배열을 만들어서 , 기존보다 더 크게/작게 만들어서 사용
		 * 		동적인 크기를 갖는것처럼 만든것.
		 * 
		 */
		System.out.println("=================");
		int arr5[]= new int[3];
		arr5[0]=1; arr5[1]=2; arr5[2]=3;
		//배열크기는 고정크기.
		int tmp[] =new int[arr5.length+1];
		for(int i=0; i<arr5.length;i++) {
			tmp[i]=arr5[i];
		}//깊은복사
		tmp[tmp.length-1]= 30;
		
		arr5=tmp;//얕은복사 (주소만옮긴다)
		
		for(int i=0; i<arr5.length; i++) {
			System.out.print(arr5[i]+" ");
		}
		System.out.println();

		
	}

}
