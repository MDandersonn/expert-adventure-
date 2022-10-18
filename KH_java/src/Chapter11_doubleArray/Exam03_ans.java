package Chapter11_doubleArray;

import java.util.Arrays;
import java.util.Random;

public class Exam03_ans {

	public static void main(String[] args) {
		Random rand = new Random();
		int rowSize=3 ;//rand.nextInt(8)+3;
		int colSize=5 ;// rand.nextInt(6)+5;
		int arr[][]=new int[rowSize][colSize];
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<colSize;j++) {
				arr[i][j]=rand.nextInt(90)+10;
			}
		}
		
		int even[] = new int[0];
		int odd[]= new int[0];
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<colSize;j++) {
				if(arr[i][j]%2 ==0) {
					even=Arrays.copyOf(even, even.length+1);
					even[even.length-1]=arr[i][j];
					
				}else {
					odd= Arrays.copyOf(odd, odd.length+1);
					odd[odd.length-1]=arr[i][j];
					
				}
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		
		int sum[]=new int[0];
//		int minSize= even.length< odd.length ? even.length: odd.length;
		
		int minSize=odd.length;
		boolean isEvenLong=true; //짝수가 크냐 true면 네 
		
		if(even.length<odd.length) {
			minSize=even.length;
			isEvenLong=false;//false면 아니오
		}
		
		
		for (int i=0 ; i<minSize; i++) {
			sum= Arrays.copyOf(sum, sum.length+1);
			sum[i]= even[i]+odd[i];		
		}
		
		int overSize=0;
		if(isEvenLong) {
			//짝수배열의크기가 클때
			overSize= even.length-odd.length;
			sum=Arrays.copyOf(sum, sum.length+overSize);
			System.arraycopy(even, odd.length-1, sum, odd.length-1, overSize);
		}else {
			//홀수배열의 크기가 클때
			overSize= odd.length-even.length;
			sum=Arrays.copyOf(sum, sum.length+overSize);
			System.arraycopy(even, odd.length-1, sum, odd.length-1, overSize);
		}
		System.out.println(Arrays.toString(sum));
		
		

	}

}
