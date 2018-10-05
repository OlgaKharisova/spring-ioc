package decorator.pizza;

import decorator.Pizza;

public class PizzaAmerican extends Pizza {

    public PizzaAmerican() {
        description = "с толстым тестом";
    }

    @Override
    public double cost() {
        return 800.99;
    }
}
