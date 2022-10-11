package Chapter0_5_classExam2;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class MaxLimitCalculator extends Calculator{

	@Override
	void add(int val) {
		this.value +=val;
		if(this.value>=100) {
			this.value=100;
		}
	}
	
	
	
}
public class two {

	public static void main(String[] args) {
		
		MaxLimitCalculator cal = new MaxLimitCalculator();
		cal.add(50);  // 50 더하기
		cal.add(60);  // 60 더하기
		System.out.println(cal.getValue());  // 100 출력

	}

}
