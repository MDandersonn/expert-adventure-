package Chapter13_Exam;

public class Ex03_ans2 {

	public static void main(String[] args) {
		int n=0;
		int result=1;
		while(n/10!=0) {
			
			n=n/10;
			result++;
		}
		System.out.println(result);

	}

}
