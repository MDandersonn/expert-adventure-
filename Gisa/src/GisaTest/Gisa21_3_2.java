package GisaTest;
//중요
/*
 *  비트연산자 & : 좌우 다 확인 
 * ^연산자 : 같지않으면 T 같으면 F
 *  연산자우선순위 증감연산자> 산술연산자>비교연산자>비트>논리>대입연산자
 * 
 */

public class Gisa21_3_2 {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 3, d = 5;
		if((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d)) {
			a = b + c;
			if(7 == b ^ c != a) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		} else {
			a = c + d;
			if(7 == c ^ d != a) {
				System.out.println(a);
			} else {
				System.out.println(d);
			}
		}
	}

}
