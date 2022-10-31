
public class Test {

	public static void main(String[] args) {
//		String[] sArr = {"사과","딸기","오렌지"};
		
		for(int i=1;i<=9;i=i+2) {
			System.out.println(2+"*"+i+"="+(2*i));
		}
		
		
		String[] sArr = new String[3];

		System.out.println(sArr);

		System.out.println(sArr[0]);
		
		int[] iArr = {1,2,3,4,5};
		for(int s :iArr) {
			System.out.println(s);
		}

	}

}
