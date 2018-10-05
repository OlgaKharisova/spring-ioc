package ru.innopolis.stc13.patterns.structural.decorator.pizza;

import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

public class PizzaAmerican extends Pizza {

    public PizzaAmerican() {
        description = "с толстым тестом";
    }

    @Override
    public double cost() {
        return 800.99;
    }
}