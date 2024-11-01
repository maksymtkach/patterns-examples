package org.example.BuilderPattern;

// Клас FoodOrder для представлення замовлення страви
public class FoodOrder {
    private String mainDish;
    private String sideDish;
    private String drink;
    private boolean isTakeout;

    // Приватний конструктор використовується Builder'ом
    private FoodOrder(Builder builder) {
        this.mainDish = builder.mainDish;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.isTakeout = builder.isTakeout;
    }

    // Builder для створення FoodOrder з різними параметрами
    public static class Builder {
        private String mainDish;
        private String sideDish;
        private String drink;
        private boolean isTakeout;

        public Builder(String mainDish) {
            this.mainDish = mainDish;
        }

        public Builder sideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder takeout(boolean isTakeout) {
            this.isTakeout = isTakeout;
            return this;
        }

        public FoodOrder build() {
            return new FoodOrder(this);
        }
    }

    @Override
    public String toString() {
        return "FoodOrder [mainDish=" + mainDish + ", sideDish=" + sideDish +
                ", drink=" + drink + ", takeout=" + isTakeout + "]";
    }
}



