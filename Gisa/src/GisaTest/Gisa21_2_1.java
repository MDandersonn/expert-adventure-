package GisaTest;


public class Gisa21_2_1 {
	public static void main(String[] args){
		Gisa21_2_1  a1 = new Gisa21_2_1();
		Gisa21_2_1  a2 = new ovr2();
		System.out.println(a1.sun(3,2) + a2.sun(3,2));
	}

	int sun(int x, int y){
		return x + y;
	}
}

class ovr2 extends Gisa21_2_1 {
	int sun(int x, int y){
		return x - y + super.sun(x,y);
	}
}