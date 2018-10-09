package ru.innopolis.stc13.patterns.structural.decorator.pizza;

import org.springframework.stereotype.Component;
import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

@Component
public class PizzaItalian extends Pizza {

    public PizzaItalian() {
        description = "со специями и ветчиной";
    }

    @Override
    public double cost() {
        return 599.99;
    }
}