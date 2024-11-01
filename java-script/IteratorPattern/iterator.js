// Меню ресторану з методом ітератора
class Menu {
    constructor() {
        this.items = [];
    }

    addItem(item) {
        this.items.push(item);
    }

    [Symbol.iterator]() {
        let index = 0;
        const items = this.items;
        return {
            next() {
                if (index < items.length) {
                    return { value: items[index++], done: false };
                } else {
                    return { done: true };
                }
            }
        };
    }
}

const menu = new Menu();
menu.addItem("Pizza");
menu.addItem("Pasta");
menu.addItem("Salad");

for (const item of menu) {
    console.log(item);
}
