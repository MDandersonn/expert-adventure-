package Chapter0_11_classExam7;

interface Mineral{
	int setValue();
	
}
class Gold implements Mineral {

	@Override
	public int setValue() {
		return 100;
	}
	
	
}

class Silver implements Mineral {

	@Override
	public int setValue() {
		return 90;
	}
	
}

class Bronze implements Mineral{

	@Override
	public int setValue() {
		return 80;
	}


}

class MineralCalculator {
    int value = 0;
    
    public void add(Mineral m) {
    	this.value += m.setValue();
    	
    }

    public int getValue() {
        return this.value;
    }
}
public class seven_1 {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }

}