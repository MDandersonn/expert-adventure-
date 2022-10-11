package Chapter0_14_classExam9;
interface Predator {
    String bark();
}

abstract class Animal {
    public String hello() {
        return "hello";
    }
//    public String bark() {
//        return "Bark111111 bark!!";
//    }
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
    
	public String bark() {
        return "Bark bark!!";
    }
}

public class nine {
    public static void main(String[] args) {
        Animal a = new Lion();
        Lion b = new Lion();
        Predator c = new Lion();

        System.out.println(a.hello());  // 1번
        //System.out.println(a.bark());   // 2번
        //오버라이딩되지않아있으면 , 자식타입의 메서드를 이용할수없다.
        System.out.println(b.hello());  // 3번
        System.out.println(b.bark());   // 4번
        //System.out.println(c.hello());  // 5번
        System.out.println(c.bark());   // 6번
    }
}