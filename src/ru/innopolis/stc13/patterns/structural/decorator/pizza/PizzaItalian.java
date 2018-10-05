package decorator.pizza;

import decorator.Pizza;

public class PizzaItalian extends Pizza {

    public PizzaItalian() {
        description = "со специями и ветчиной";
    }

    @Override
    public double cost() {
        return 599.99;
    }
}
