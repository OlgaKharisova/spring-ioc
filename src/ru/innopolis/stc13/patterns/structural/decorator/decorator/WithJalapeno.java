package ru.innopolis.stc13.patterns.structural.decorator.decorator;

import org.springframework.stereotype.Component;
import ru.innopolis.stc13.patterns.structural.decorator.Decorator;
import ru.innopolis.stc13.patterns.structural.decorator.Pizza;

@Component
public class WithJalapeno extends Decorator {

    private Pizza pizza;

    public WithJalapeno() {
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

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