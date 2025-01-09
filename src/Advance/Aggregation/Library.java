package Advance.Aggregation;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name,int year,Book[] books){
        this.name = name;
        this.year=year;
        this.books=books;
    }

    void displayInfo(){
        System.out.println("The "+this.year+" "+this.name);
        System.out.println("Book available:");
        for(Book b:books){
            System.out.println(b.displayName());
        }
    }
}
