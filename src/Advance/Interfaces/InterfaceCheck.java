package Advance.Interfaces;

interface Payment{
    void makePayment(double money);
}

class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal");
    }
}

public class InterfaceCheck {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.makePayment(5000);
    }
}
