package Chapter9_for;

public class exam05 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=0; j<i; j++,k++) {
				System.out.print(k+"  ");
			}
			System.out.println();
		}
		
		int colCount=1 , rowCount=1;
		for(int i=1;i<=15; i++, colCount++) {
			System.out.printf("%d\t",i);
			if(colCount==rowCount) {
				System.out.println();
				colCount=0;
				rowCount++;
			}
		}
		System.out.println();
		System.out.println("================================");
		int n=0;
		for(rowCount=1; rowCount<=5;rowCount++) {
			for(colCount=1;colCount<=rowCount;colCount++) {
				n++;
				System.out.printf("%d\t",n);
				
			}
			System.out.println();
		}
			
		
	}
	
	
}

