package day25inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Bird b1 = new Bird();
        c1.eat();
        c1.drink();
        c1.meow();

        d1.eat();
        d1.drink();
        d1.bark();

        b1.eat();
        b1.drink();
        b1.tweet();
    }
}
