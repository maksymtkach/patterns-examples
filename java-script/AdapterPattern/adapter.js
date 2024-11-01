// Клас нової платіжної системи
class PaymentProcessor {
    processPayment(amount) {
        console.log(`Processing payment of $${amount}`);
    }
}

// Стара система оплати
class OldPaymentSystem {
    makePayment(amount) {
        console.log(`Payment of $${amount} made with old system`);
    }
}

// Адаптер для сумісності старої системи з новою
class PaymentAdapter {
    constructor(oldSystem) {
        this.oldSystem = oldSystem;
    }

    processPayment(amount) {
        this.oldSystem.makePayment(amount);
    }
}

const oldSystem = new OldPaymentSystem();
const adapter = new PaymentAdapter(oldSystem);
adapter.processPayment(100.00);
