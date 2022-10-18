package Chapter12_schedule;

import Chapter12_watchclass.*;

public class ScheduleTest {

	public static void main(String[] args) {
		Schedule s1= new Schedule(2006,10,1);
		Schedule s2= new Schedule(2007,12,12);
		s1.showAll(s1);
		s1.toJongIl(s1);
		s1.showAll(s1);
		

	}

}
