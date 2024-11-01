package org.example.FacadePattern;

// Система оплати
class Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " completed.");
    }
}
