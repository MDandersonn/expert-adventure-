package Chapter0_13_classExam8;

interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}

public class eight{
    public static void main(String[] args) {
        Animal a = new Animal();  // 1번 
        Animal b = new Dog();  // 2번
        Animal c = new Lion();  // 3번
        Dog d = (Dog) new Animal();  // 4번
        Predator e = new Lion();  // 5번
    }
}