package Advance.Enum;
enum CoffeeSize {
    SMALL(100), MEDIUM(200), LARGE(300); // Enum constants with associated data

    private final int price; // Field to store price

    // Constructor
    CoffeeSize(int price) {
        this.price = price;
    }

    // Getter method
    public int getPrice() {
        return price;
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeSize size = CoffeeSize.LARGE;

        // Accessing enum properties
        System.out.println("Selected size: " + size);
        System.out.println("Price: $" + size.getPrice());

        // Using enums in switch statement
        switch (size) {
            case SMALL -> System.out.println("Small coffee selected.");
            case MEDIUM -> System.out.println("Medium coffee selected.");
            case LARGE -> System.out.println("Large coffee selected.");
        }
    }
}

