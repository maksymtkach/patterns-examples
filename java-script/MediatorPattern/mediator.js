// Клас Посередника
class ChatMediator {
    constructor() {
        this.users = [];
    }

    addUser(user) {
        this.users.push(user);
    }

    sendMessage(message, sender) {
        this.users.forEach(user => {
            if (user !== sender) {
                user.receive(message);
            }
        });
    }
}

// Клас користувача
class User {
    constructor(name, mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    send(message) {
        console.log(`${this.name} sends: ${message}`);
        this.mediator.sendMessage(message, this);
    }

    receive(message) {
        console.log(`${this.name} received: ${message}`);
    }
}

const mediator = new ChatMediator();
const alice = new User("Alice", mediator);
const bob = new User("Bob", mediator);

mediator.addUser(alice);
mediator.addUser(bob);

alice.send("Hello, everyone!");
bob.send("Hi, Alice!");
