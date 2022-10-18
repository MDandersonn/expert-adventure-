package Chapter12_schedule;

import Chapter12_watchclass.Schedule;

public class ImportTest {

	public static void main(String[] args) {
		Schedule a = new Schedule(2008,10,22);
		//퍼블릭이여도 임포트를 해야 사용할 수 있다.
		System.out.println(a.getDay());
		//default메서드는 임포트해도 사용하지못한ㄷ.
		
		

	}

}
