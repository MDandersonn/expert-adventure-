package Chapter13_Exam;

public class Ex02 {
	public static int getTotalPage(int m,int n) {
		if(m%n==0) {
			return m/n;
		}
		else {
			return m/n+1;
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * ※ 이렇게 게시판의 페이지 수를 보여 주는 것을 "페이징"한다고 부른다.

메소드 이름은? getTotalPage
입력 받는 값은? 게시물의 총 건수(m), 한 페이지에 보여줄 게시물 수(n)
출력하는 값은? 총 페이지수
		 */
		System.out.println(getTotalPage(5, 10));
		System.out.println(getTotalPage(15, 10));
		System.out.println(getTotalPage(25, 10));
		System.out.println(getTotalPage(30, 10));
		
		
		
	}

}
