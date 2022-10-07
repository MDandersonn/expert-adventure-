package Chapter4_abstractClass;

abstract class Predator extends Animal {
	abstract String  getFood();
}

interface Barkable {
	String bark();
}

class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Predator implements Barkable   {
	public String getFood() {
        return "apple";
    }

	public String bark() {
		return "어흥";
	}
	
}

class Lion extends Predator implements Barkable   {
	public String getFood() {
        return "banana";
    }

	public String bark() {
		return "으르렁";
	}
	
}

class ZooKeeper {
//    void feed(Tiger tiger) {  // 호랑이가 오면 사과를 던져 준다.
//        System.out.println("feed apple");
//    }
//
//    void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
//        System.out.println("feed banana");
//    }
	void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }

}

class Bouncer {
    void barkAnimal(Barkable b1) {
//        if (animal instanceof Tiger) {
//            System.out.println("어흥");
//        } else if (animal instanceof Lion) {
//            System.out.println("으르렁");
//        }
    	System.out.println(b1.bark());
    }
}

public class Sample {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}