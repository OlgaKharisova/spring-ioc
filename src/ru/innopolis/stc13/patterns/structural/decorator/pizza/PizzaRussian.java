package ru.innopolis.stc13.patterns.structural.decorator.pizza;

import org.springframework.stereotype.Component;
import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

@Component
public class PizzaRussian extends Pizza {

    public PizzaRussian() {
        description= "вкусная и сытная";
    }

    @Override
    public double cost() {
        return 399.99;
    }
}