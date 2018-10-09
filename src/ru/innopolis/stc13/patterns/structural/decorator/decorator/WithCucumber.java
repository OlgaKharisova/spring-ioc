package ru.innopolis.stc13.patterns.structural.decorator.decorator;

import org.springframework.stereotype.Component;
import ru.innopolis.stc13.patterns.structural.decorator.Decorator;
import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

@Component
public class WithCucumber extends Decorator {

    private Pizza pizza;

    public WithCucumber(Pizza pizza) {
        this.pizza = pizza;
    }

    public WithCucumber() {
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
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
