package GisaTest;


class Car1 implements Runnable{
	int a;

	public void run(){
		System.out.println("Hello");
	}

}

public class Gisa22_1_1 {
	public static void main(String[] args){
		Thread t1 = new Thread(new Car1());
		t1.start();
	}
}

