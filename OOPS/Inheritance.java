package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.breathe();
        shark.swim();
    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathe");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}
