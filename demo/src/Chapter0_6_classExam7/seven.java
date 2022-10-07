package Chapter0_6_classExam7;
class Gold {
}

class Silver {
}

class Bronze {
}

class MineralCalculator {
    int value = 0;

    public void add(Gold gold) {
        this.value += 100;
    }

    public void add(Silver silver) {
        this.value += 90;
    }

    public void add(Bronze bronze) {
        this.value += 80;
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
