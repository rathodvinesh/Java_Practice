package OOPS.FourPillars;

class CompileTime{
    public int add(int a,int b){
        System.out.println("In compiletime");
        return a+b;
    }

    public int add(int a,int b,int c){
        return  a+b+c;
    }
}

class RunTime extends CompileTime{
    public int add(int a,int b){
        System.out.println("In runtime");
        return a+b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        CompileTime cb = new RunTime();
//        cb.add(1,3);
//        cb.add(1,6,4);

        System.out.println(cb.add(1,6));
//        Me.run();

//        System.out.println();
    }
}
