package Chapter0_2_exam;

public class Star {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============================");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		int num=5;
		int k=1;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-k; j++) {
				System.out.print(" ");
				}
			for(int j=0; j<k; j++) {
				System.out.print("*");
				}
			k++;
			System.out.println();
		}
		
		System.out.println("============================");
		int num1=5;
		int k1=0;
		for(int i=0; i<num1; i++) {
			for(int j=0; j<num1-k1; j++) {
				System.out.print("*");
				}
			for(int j=0; j<k1; j++) {
				System.out.print(" ");
				}
			k1++;
			System.out.println();
		}
		
		System.out.println("============================");
		
		int num2=3;
		int k2=0;
		for(int i=0; i<num2; i++) {
			for(int j=0; j<num2-1-k2; j++) {
				System.out.print(" ");
				}
			for(int j=0; j<2*k2+1; j++) {
				System.out.print("*");
				}
			k2++;
			System.out.println();
		}
		System.out.println("============================");
		
		int num3=3;
		int k3=0;
		for(int i=0; i<num3; i++) {
			for(int j=0; j<k3; j++) {
				System.out.print(" ");
				}
			for(int j=0; j<-2*k3+5; j++) {
				System.out.print("*");
				}
			
			k3++;
			System.out.println();
		}
		

	}

}
