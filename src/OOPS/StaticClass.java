package OOPS;

 class Me{
    static int age=15;
    String name;

    static void run(){
        System.out.println("I can run");
    }

    static {
        int school;
        System.out.println("I am in static");
    }

    public void u(){
        System.out.println("i");
    }
}

public class StaticClass {
    public static void main(String[] args) {
        Me.age = 12;
    }
}
