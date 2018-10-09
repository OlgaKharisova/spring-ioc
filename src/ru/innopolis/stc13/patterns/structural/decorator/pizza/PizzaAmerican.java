package ru.innopolis.stc13.patterns.structural.decorator.pizza;

import org.springframework.stereotype.Component;
import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

@Component
public class PizzaAmerican extends Pizza {

    public PizzaAmerican() {
        description = "с толстым тестом";
    }

    @Override
    public double cost() {
        return 800.99;
    }
}