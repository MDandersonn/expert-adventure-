package Chapter12_watchclass;

public class Watch {
	private int hour;
	private int minute;
	private int second;
	private String afternoon;
	
	public Watch(int hour, int minute, int second) {
		super();
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	
		this.setAfternoon();
		
	}
	String hourNow() {
		
		//오호~~~~~0붙여서 시간출력방법!!!!!!!!!!!
		String str="";	
		str +=this.hour<=9 ? "0"+this.hour : this.hour;
		str +=":";
		str +=this.minute<=9 ? "0"+this.minute : this.minute;
		str +=":";
		str +=this.second<=9 ? "0"+this.second : this.second;
			return (str+" "+afternoon);

	}
	void oneMinuteBefore() {
		int temp=minute--;// 1감소 !!!!!!!!!!!!!!!
		if(temp<0) {
			this.minute =59;
			this.oneHourBefore();
		}else {
			this.minute=temp;
		}
	}
	void oneMinuteAfter() {
		int temp=minute++; // 1증가 !!!!!!!!!!!
		if(temp>59) {
			this.minute =0;
			this.oneHourAfter();
		}else {
			this.minute=temp;
		}
		
	}
	void oneSecondBefore() {
		int temp=second-1;
		if(temp<0) {
			this.second =59;
			this.oneMinuteBefore();
		}else {
			this.second=temp;
		}
	}
	void oneSecondAfter() {
		int temp=second+1;
		if(temp>59) {
			this.second =0;
			this.oneMinuteAfter();
		}else {
			this.second=temp;
		}
	}
	void oneHourBefore() {
		int temp=hour-1;
		if(temp<0) {
			this.hour =23;
		}else {
			this.hour=temp;
		}
	}
	void oneHourAfter() {
		int temp=hour+1;
		if(temp>23) {
			this.hour =0;
		}else {
			this.hour=temp;
		}
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour>=0 && hour<=23 ) {
			this.hour = hour;
		}
		
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute>=0 && minute<60 ) {
			this.minute = minute;
		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second>=0 && second<60 ) {
			this.second = second;
		}
	}

	public void setAfternoon() {
		if(hour>=0 && hour<=11 ) {
			this.afternoon="오전";	
		}else {
			this.afternoon="오후";	
		}
	}
	

}
