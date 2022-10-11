package Chapter0_7_classExam4_1;

import java.util.ArrayList;
import java.util.Arrays;
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
    double avg(ArrayList<Integer> a) {
    	int sum=0;
    	for(int i : a) {
    		sum +=i;	
    	}
    	return sum/a.size();	
    }
    double avg(int[] a) {
    	int sum=0;
    	for(int i : a) {
    		sum +=i;	
    	}
    	return sum/a.length;	
    }
    
    
}

public class four {

	public static void main(String[] args) {
		int[] data = {1, 3, 5, 7, 9};
		Calculator cal = new Calculator();
		double result = cal.avg(data);
		System.out.println(result);  // 5 출력
		
		ArrayList<Integer> data1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		Calculator cal1 = new Calculator();
		double result1 = cal1.avg(data1);
		System.out.println(result1);  // 5 출력

	}
}

