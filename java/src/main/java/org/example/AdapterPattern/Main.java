package org.example.AdapterPattern;

// Використання Adapter
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentAdapter(new OldPaymentSystem());
        processor.processPayment(100.00);
    }
}
