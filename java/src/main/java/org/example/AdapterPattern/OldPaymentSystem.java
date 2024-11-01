package org.example.AdapterPattern;

// Стара система оплати, яку потрібно адаптувати
class OldPaymentSystem {
    void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made with old system");
    }
}
