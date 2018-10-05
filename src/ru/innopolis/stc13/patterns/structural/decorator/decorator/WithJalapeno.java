package ru.innopolis.stc13.patterns.structural.decorator.decorator;

import ru.innopolis.stc13.patterns.structural.decorator.Decorator;
import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

public class WithJalapeno extends Decorator {

    private Pizza pizza;

    public WithJalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", с халапеньо";
    }

    @Override
    public double cost() {
        return pizza.cost() + 50.00;
    }
}