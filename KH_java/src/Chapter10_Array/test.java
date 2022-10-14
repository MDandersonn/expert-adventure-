package Chapter10_Array;

public class test {

	public static void main(String[] args) {
		for(int i=0 ;i<-1 ;i++) {
			System.out.println(2);
		}
		
		int a=7;
		int b=2;
		double c=2.0;
		System.out.println(a/b);
		System.out.println( ((double)a)/(b) );
		System.out.println(  (double)(a/b) );
		System.out.println(a/c);//한개만 double이기만하면 제대로나옴
		
		
		for(int i=0;i<10 ;i++) {
			
			if(i==5) {
				continue;//아래꺼 실행안하고 i=6으로 간다. 
			}
			System.out.println(i);
		}
	}

}
