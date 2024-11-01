// Конструктор MenuItem з методом клонування
function MenuItem(name, price) {
    this.name = name;
    this.price = price;
}

// Метод для клонування екземпляра
MenuItem.prototype.clone = function () {
    return new MenuItem(this.name, this.price);
};

const pizza = new MenuItem("Pizza", 10.0);
const pizzaClone = pizza.clone();

console.log("Original Pizza:", pizza);
console.log("Cloned Pizza:", pizzaClone);
