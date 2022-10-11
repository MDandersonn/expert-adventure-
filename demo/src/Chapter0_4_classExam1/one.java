package Chapter0_4_classExam1;

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
    
    void minus(int a) {
    	this.value -=a;
    }
}

class UpgradeCalculator extends Calculator{

}
public class one {
    public static void main(String[] args) {
//        Calculator cal = new Calculator();
//        cal.add(10);
//        System.out.println(cal.getValue());  // 10 출력
        
       
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        System.out.println(cal.getValue());
        cal.minus(7);
        System.out.println(cal.getValue());  // 10에서 7을 뺀 3을 출력
    }
}

