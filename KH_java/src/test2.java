import java.util.Scanner;

public class test2 {
	public void test() {}
	public void test(String str) {}
	public void test(int i) {}
//	public void test(String s) {}// 2번째와 같은 메서드라서 지운다.
	public void test(char ch) {}
	public void test(String str, int i) {}
	public void test(int i, String str) {}
//	private void test(int i) {}//3번째와 접근제한자만 다를뿐 중복된다. 지운다
//	public int test() {return 0;}//메서드명을 바꾸거나 지운다.
	//메서드오버로딩은 매개변수의 타입, 순서에 의해서만 가능하다.
	//다른 접근제한자또는 다른 반환타입으로는 오버로딩 할 수없다.
	public static void sum() {
		Scanner sc =new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요:");
		int num= sc.nextInt();
		int sum=0;
		if(num>=0) {//num>0
			int i=1;
			while(i<=num) {
				sum+=i;
				//i++;//
			}
			System.out.println("1부터"+num+"까지의 합은"+sum);
		}else {
			System.out.println("숫자가 1이상이아니다.");
		}
	}
	
	public static void main(String[] args) {
		sum();

	}

}
