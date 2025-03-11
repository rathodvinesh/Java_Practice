package OOPS.FourPillars.Inhertiance;

class Animal{
    String color;

    public void eat(){
        System.out.println("Can eat");
    }

    public void breathe(){
        System.out.println("Can breathe");
    }
}

class Mammal extends Animal{
    public void walk(){
        System.out.println("Animal can walk");
    }
}

public class SingleLevelInheritance{
    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.eat();
        m.breathe();
        m.walk();
    }
}
