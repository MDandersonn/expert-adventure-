package Chapter0_4_classExam3;
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
    boolean isOdd(int val) {
    	if(val%2==0) {
    		return false;
    	}
    	else {
    		return true;
    	}
    	
    }
}

public class three {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.isOdd(15));

	}

}
