package Chapter0_10_classExam7;

class Mineral{
	int value;
	
}
class Gold extends Mineral {
//	int value=100;
	public Gold() {
		super();
		value=100;
	}
	
}

class Silver extends Mineral {
//	int value=90;
	public Silver() {
		super();
		value=90;
	}
	
	
}

class Bronze extends Mineral{
//	int value=80;
	public Bronze() {
		super();
		value=80;
	}

}

class MineralCalculator {
    int value = 0;
    
    public void add(Mineral m) {
    	this.value += m.value;
    	
    }

    public int getValue() {
        return this.value;
    }
}
public class seven {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }

}
