package org.example.AdapterPattern;

// Адаптер, що робить стару систему сумісною з новим інтерфейсом
class PaymentAdapter implements PaymentProcessor {
    private OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    @Override
    public void processPayment(double amount) {
        oldPaymentSystem.makePayment(amount); // Виклик методу старої системи
    }
}
