package Advance.Generics;

public class Generics {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            type parameter (placeholder that gets replaced with a real type)
        //            type argument (specifies the type)

        Box<Integer> b1 = new Box<>();
        b1.setItem(6);
        System.out.println(b1.getItem());

        Box<String> b2 = new Box<>();
        b2.setItem("Abc");
        System.out.println(b2.getItem());
    }
}
