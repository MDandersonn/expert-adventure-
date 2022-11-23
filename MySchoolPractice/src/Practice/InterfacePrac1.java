package Practice;

abstract class PredatorAb extends Animal {
    abstract String getFood();

    void printFood() {  // default 를 제거한다.
        System.out.printf("my food is %s\n", getFood());
    }

    static int LEG_COUNT = 4;  // 추상 클래스의 상수는 static 선언이 필요하다.
    static int speed() {
        return LEG_COUNT * 30;
    }
    
    //추상 클래스는 인터페이스와는 달리 일반 클래스처럼 
    //객체변수, 생성자, private 메서드 등을 가질 수 있다.
    
}

interface Predator{
	public  void eat();
}
interface Barkable  {
	public void bark();
	
}

interface BarkablePredator extends Predator,Barkable{
	//. 인터페이스는 일반 클래스와는 달리 extends 를 이용하여 
	//여러개의 인터페이스(Predator, Barkable)를 동시에 상속할 수 있다.
	//즉, 다중 상속이 지원된다.
}

class toto{
	
}

interface totoz{
	
}
class Animal{
	String name; 	
}

class Zookeeper{
		
	public void feed(Animal a) {
		System.out.println(a+"에게 ");
	}
	
}

class Tiger extends Animal implements Predator, Barkable{
	@Override
	public void eat() {
		System.out.println("호랑이가 사과를 먹음");
	}

	@Override
	public void bark() {
		System.out.println("호랑이가 짖다");
	}

}

class Lion extends Animal implements BarkablePredator{
	
	@Override
	public void eat() {
		System.out.println("사자가 바나나를 먹음");
	}
	
	@Override
	public void bark() {
		System.out.println("사자가 짖다");
	}
	
}
class Bouncer{
	public void barkAnimal(Barkable a) {
		a.bark();
	}
}

public class InterfacePrac1 {

	public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        
	}
}
