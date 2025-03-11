package Advance.Composition;

public class Car {
    String model;
    int year;
    Engine engine;

    Car(String model,int year,String engineType){
        this.model = model;
        this.year = year;
        this.engine  = new Engine(engineType);
    }

    void start(){
        System.out.println("The "+this.model+" started with "+this.engine.type+" engine");
    }
}
