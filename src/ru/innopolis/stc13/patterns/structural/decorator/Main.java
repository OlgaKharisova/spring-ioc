package ru.innopolis.stc13.patterns.structural.decorator;

import ru.innopolis.stc13.patterns.structural.decorator.decorator.WithCucumber;
import ru.innopolis.stc13.patterns.structural.decorator.decorator.WithJalapeno;
import ru.innopolis.stc13.patterns.structural.decorator.pizza.PizzaRussian;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new PizzaRussian();
        pizza = new WithCucumber(pizza);
        pizza = new WithJalapeno(pizza);
        pizza = new WithCucumber(pizza);
        System.out.println(pizza.getDescription() + " цена:" + pizza.cost());
    }
}