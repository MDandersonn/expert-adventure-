package Chapter03_형변환;

public class Casting {

	public static void main(String[] args) {
		/**
		 * 형변환:변수에 저장된 특정 자료형의 데이터를 다른 자료형의 변수에 저장하기 위해서 자료형의 종류를 변환.
		 * 
		 * 형변환은 일반적으로 다음의 경우에 필요하다.
		 * 정수 -> 정수/ 정수->실수  / 실수 -> 정수   / 실수 ->실수
		 * 
		 * 자료형의 크기가 작은 자료형에서 큰 자료형으로 변환을 할 때 ->자동 형변환
		 * 자료형의 크기가 큰 자료형에서 작은 자료형으로 변환을 할 때 ->강제 형변환
		 * 
		 */
		byte bt1;
		short st1 =500;
		bt1 = (byte) st1;// 큰자료형에서 작은자료형으로
		System.out.println(bt1);
		
		byte bt2=13;
		short st2;
		st2= bt2;// 작은자료형에서 큰자료형으로변환
		System.out.println(st2);
		
		//int it1 = 10 + 10.5;
		//동일한자료형으로 맞춰야하는데 작은자료형에서 큰자료형으로 변환
		//그래서 10을 10.0으로 바꿔줌. 근데 왼쪽은 int인게 문제,.
		//해결방법2가지
		//왼쪽을 더블형으로
		double it2 = 10 + 10.5;
		System.out.println(it2);
		//오른쪽을 int로.
		int it3 = (int)(10 + 10.5);
		System.out.println(it3);
		
		String str1 = "문자열";
		System.out.println(str1+10);  //문자열과의 합산은 결합된문자로출력
		
		

	}

}
