package Advance.AnonymousInnerClass;

abstract class A{//With abstract cannot instantiate
    abstract void show();
}

interface B{ //With interface
    void show();
}

public class AnnInnerClass {
    public static void main(String[] args) {
//        A ob = new A();
        A obj = new A() { //For that we only take a reference -> for instantiating we need to implement the methods same for interface
            @Override
            void show() {
                System.out.println("In Anonymous");
            }
        };
//        B ob = new B();
        B obj1 = new B() {
            @Override
            public void show() {
                System.out.println("In interface Anonymous class");
            }
        };

        obj1.show();
    }
}
