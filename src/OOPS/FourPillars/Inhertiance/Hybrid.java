package OOPS.FourPillars.Inhertiance;

class Animal4 {
    String color;

    public void eat(){
        System.out.println("Can eat");
    }

    public void breathe(){
        System.out.println("Can breathe");
    }
}

class Mammal4 extends Animal4 {
    public void walk(){
        System.out.println("Animal can walk");
    }
}

class Dog4 extends Mammal4{
    public void legs(){
        System.out.println("Has 4 legs");
    }
}

class Fish4 extends Animal4 {
    public void swims(){
        System.out.println("Has 4 legs");
    }
}

class Tuna extends Fish4{
    public void tunaFish(){
        System.out.println("Tuna Swims");
    }
}

class Birds4 extends Animal4 {
    public void fly(){
        System.out.println("Can fly");
    }
}

class Peacock extends Birds4{
    public void peacockBird(){
        System.out.println("Peacock is a bird");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Tuna t = new Tuna();
        Dog d = new Dog();
        Peacock p = new Peacock();
    }
}
