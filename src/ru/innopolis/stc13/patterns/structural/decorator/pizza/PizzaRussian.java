package decorator.pizza;

import decorator.Pizza;

public class PizzaRussian extends Pizza {

    public PizzaRussian() {
        description= "вкусная и сытная";
    }

    @Override
    public double cost() {
        return 399.99;
    }
}
