// Загальний інтерфейс для елементів меню
class MenuComponent {
    display() {}
}

// Елемент меню
class MenuItem extends MenuComponent {
    constructor(name) {
        super();
        this.name = name;
    }

    display() {
        console.log("Item:", this.name);
    }
}

// Меню, яке містить елементи та підменю
class Menu extends MenuComponent {
    constructor(name) {
        super();
        this.name = name;
        this.components = [];
    }

    add(component) {
        this.components.push(component);
    }

    display() {
        console.log("Menu:", this.name);
        this.components.forEach(component => component.display());
    }
}

const mainMenu = new Menu("Main Menu");
const item1 = new MenuItem("Pizza");
const item2 = new MenuItem("Salad");

const subMenu = new Menu("Drinks");
subMenu.add(new MenuItem("Cola"));
subMenu.add(new MenuItem("Water"));

mainMenu.add(item1);
mainMenu.add(item2);
mainMenu.add(subMenu);

mainMenu.display();
