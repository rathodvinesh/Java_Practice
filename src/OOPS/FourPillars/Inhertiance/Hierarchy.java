package OOPS.FourPillars.Inhertiance;

class Animal2{
    String color;

    public void eat(){
        System.out.println("Can eat");
    }

    public void breathe(){
        System.out.println("Can breathe");
    }
}

class Mammal2 extends Animal {
    public void walk(){
        System.out.println("Animal can walk");
    }
}

class Fish extends Animal {
    public void swims(){
        System.out.println("Has 4 legs");
    }
}

class Birds extends Animal {
    public void fly(){
        System.out.println("Can fly");
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        //any of the class extends the animal class
    }
}
