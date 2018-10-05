package ru.innopolis.stc13.patterns.structural.decorator.decorator;

import ru.innopolis.stc13.patterns.structural.decorator.Decorator;
import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

public class WithCucumber extends Decorator {

    private Pizza pizza;

    public WithCucumber(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", с соленым огурцом";
    }

    @Override
    public double cost() {
        return pizza.cost() + 20.00;
    }
}
