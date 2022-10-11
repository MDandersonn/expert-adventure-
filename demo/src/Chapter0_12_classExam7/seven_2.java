package Chapter0_12_classExam7;

class Mineral{
	int value;
	
}
class Gold extends Mineral {
	int value=100;

}

class Silver extends Mineral {
	int value=90;

}

class Bronze extends Mineral{
	int value=80;

}

class MineralCalculator {
    int value = 0;
    
    public void add(Mineral m) {
    	if(m instanceof Gold) {
    		this.value += ((Gold)m).value;
    	}
    	if(m instanceof Silver) {
    		this.value += ((Silver)m).value;
    	}
    	if(m instanceof Bronze) {
    		this.value += ((Bronze)m).value;
    	}
    	
    }

    public int getValue() {
        return this.value;
    }
}
public class seven_2 {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }

}
