package Chapter12_watchclass;

public class Schedule {
	private int year;
	private int month;
	private int day;
	private boolean jongIl;
	private Watch startTime;
	private Watch endTime;
	
	public Schedule(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		jongIl=false;
		Watch w1=new Watch(9,0,0);
		Watch w2=new Watch(10,0,0);
		this.startTime=w1 ;
		this.endTime = w2;
		
	}
	public void toJongIl(Schedule s) {
		jongIl=true;
		Watch w1=new Watch(0,0,0);
		Watch w2=new Watch(23,59,59);
		s.startTime= w1;
		s.endTime=w2;

		
		
	}
	public void toTime(Schedule s,int hour,int minute, int second,
			int hour2,int minute2, int second2) {
		jongIl=false;
		Watch w1=new Watch(hour,minute,second);
		Watch w2=new Watch(hour2,minute2,second2);
		s.startTime= w1;
		s.endTime=w2;
		
	}
	public void changeDay(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	
	public void showAll(Schedule s ) {
	
		System.out.println(s.year+" "+s.month+" "+s.day+" 시작시간: "+ s.startTime.hourNow()+" 종료시간 : "+s.endTime.hourNow());
	}
	
	int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public boolean isJongIl() {
		return jongIl;
	}
	public void setJongIl(boolean jongIl) {
		this.jongIl = jongIl;
	}
	public Watch getStartTime() {
		return startTime;
	}
	public void setStartTime(Watch startTime) {
		this.startTime = startTime;
	}
	public Watch getEndTime() {
		return endTime;
	}
	public void setEndTime(Watch endTime) {
		this.endTime = endTime;
	}
	
	
	
	

}
