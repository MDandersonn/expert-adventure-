package Chapter0_4_classExam4;

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
    double avg(ArrayList<Integer> list1){
    	int sum=0;
    	for(int i=0; i<list1.size(); i++) {
    		sum= sum + (int)list1.get(i);
    	}
    	return (double)(sum/list1.size());
    }
    double avg(int[] list1){
    	int sum=0;
    	for(int i=0; i< list1.length ; i++) {
    		sum= sum + list1[i];
    	}
    	return (double)(sum/list1.length);
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
		
		System.out.println(data1.get(3));
		System.out.println(data1.size());
		
	}
}

