package Practice;

class Updater {
    void update(int count) {
        count++;
    }
    void update(Counter counter) {
        counter.count++;
}
}
class Counter {
    int count = 0;  // 객체변수
}


public class MethodPrac2 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter.count);
        System.out.println("int로받을때 after update:"+myCounter.count);
        //객체 변수 count의 값을 update메소드에 넘겨서 변경시키더라도 값에 변화가 없다. 
        //그 이유는 이전 챕터에서 알아본 것과 같이 update 메소드는 값(int 자료형)을 전달받았기 때문이다.
        myUpdater.update(myCounter);
        System.out.println("객체로받을때 after update:"+myCounter.count);
    }
}
