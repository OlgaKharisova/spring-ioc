package ru.innopolis.stc13.patterns.structural.decorator.pizza;

import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

public class PizzaItalian extends Pizza {

    public PizzaItalian() {
        description = "со специями и ветчиной";
    }

    @Override
    public double cost() {
        return 599.99;
    }
}