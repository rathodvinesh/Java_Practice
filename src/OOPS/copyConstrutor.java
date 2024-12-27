package OOPS;

class Student{

    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called......");
    }

    Student(Student s){
        this.name = s.name;
        this.roll = s.roll;
    }

    Student(String name){
        this.name = name;
    }
}

public class copyConstrutor {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Vinesh";
        obj.roll=75;
        Student obj1 = new Student(obj);
        System.out.println(obj1.name+" "+obj1.roll);
    }
}
