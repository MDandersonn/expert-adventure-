package Chapter0_9_classExam6;
class Calculator {
    Integer value=0;
    
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class six {
	public static void main(String[] args) {
	     Calculator cal = new Calculator();
	        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
	        System.out.println(cal.getValue());
	}

}
