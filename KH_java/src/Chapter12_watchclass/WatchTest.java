package Chapter12_watchclass;

public class WatchTest {

	public static void main(String[] args) {
		Watch w1 = new Watch(23, 1, 5);
		System.out.println(w1.hourNow());
		w1.oneHourAfter();
		System.out.println(w1.hourNow());
		w1.oneMinuteBefore();
		System.out.println(w1.hourNow());
		w1.oneMinuteBefore();
		System.out.println(w1.hourNow());
	}

}
