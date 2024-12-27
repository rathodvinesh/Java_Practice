package OOPS.FourPillars.Inhertiance;

class Animal1{
    String color;

    public void eat(){
        System.out.println("Can eat");
    }

    public void breathe(){
        System.out.println("Can breathe");
    }
}

class Mammal1 extends Animal1{
    public void walk(){
        System.out.println("Animal can walk");
    }
}

class Dog extends Mammal1{
    public void legs(){
        System.out.println("Has 4 legs");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.legs();
        d.eat();
        d.breathe();
    }
}
