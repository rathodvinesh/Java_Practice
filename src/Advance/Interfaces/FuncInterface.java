package Advance.Interfaces;

/*
Interfaces - >
    1.Normal Interface -> Multiple methods
    2.Func -> single method (SAM-> Single Abstract Method)
    3.Marker -> No methods
 */
//It includes func interface as well as lambda expression
@FunctionalInterface
interface A{
    void display(int i,int j);
}

public class FuncInterface {
    public static void main(String[] args) {
        A obj1 = (i,j)-> System.out.println("In display "+(i+j));
        obj1.display(1,1);
    }
}
