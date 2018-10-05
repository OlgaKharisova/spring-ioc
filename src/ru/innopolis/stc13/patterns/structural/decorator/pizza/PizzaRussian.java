package ru.innopolis.stc13.patterns.structural.decorator.pizza;

import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

public class PizzaRussian extends Pizza {

    public PizzaRussian() {
        description= "вкусная и сытная";
    }

    @Override
    public double cost() {
        return 399.99;
    }
}