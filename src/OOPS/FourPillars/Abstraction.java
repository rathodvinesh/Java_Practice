package OOPS.FourPillars;

abstract class Vehicle{ //abstract class

    Vehicle(){
        System.out.println("I am constructor of Vehicle");
    }
    abstract void start();

    public void stop(){
        System.out.println("Car stopped");
    }
}

class A extends Vehicle{ //concrete class
    public void start(){
        System.out.println("Car Started");
    }
}

public class Abstraction {

    public static void main(String[] args) {
//        Vehicle obj = new Vehicle();
        Vehicle obj = new A();
        obj.start();
        obj.stop();
    }
}
