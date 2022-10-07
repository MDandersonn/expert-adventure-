package Chapter0_2_exam;

public class sample {

	public static void main(String[] args) {
		int i=1;
		int s=0;
		while(i<=1000) {
			if(i%3==0) {
				s= s+i;
				
			}
			i++;
		}
		System.out.println(s);
	
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		
		int sum=0;
		int count=0;
		for(int ii : marks) {
			sum= sum+ii;
			count++;
		}
		System.out.println((float) (sum/count));
	}
	
	

}
