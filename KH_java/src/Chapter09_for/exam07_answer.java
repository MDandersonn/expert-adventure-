package Chapter09_for;

public class exam07_answer {


	public static void main(String[] args) {
		//토1 금 2 목 3 수 4 화5 월6 일 day:7 dateindex:0
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day; int lastDay; int dateIndex;
		day=4; dateIndex=4;
		lastDay=31;
		
		for(day=day-7+1; day<=lastDay; day++) {
			if(day>=1) {
				System.out.printf("%d\t",day);
				if(day%7 == dateIndex) {
					System.out.print("\n");
				}
			}else {
				System.out.print("\t");
			}
		}

	}

}
