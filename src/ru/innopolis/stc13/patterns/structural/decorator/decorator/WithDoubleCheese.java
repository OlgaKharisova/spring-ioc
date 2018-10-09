package ru.innopolis.stc13.patterns.structural.decorator.decorator;

import ru.innopolis.stc13.patterns.structural.decorator.Decorator;
import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

public class WithDoubleCheese extends Decorator {

    private Pizza pizza;

    public WithDoubleCheese() {
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public WithDoubleCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", с двойным сыром";
    }

    @Override
    public double cost() {
        return pizza.cost() + 100.00;
    }
}