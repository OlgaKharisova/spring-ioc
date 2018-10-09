package ru.innopolis.stc13.patterns.structural.decorator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.innopolis.stc13.patterns.structural.decorator.decorator.WithCucumber;
import ru.innopolis.stc13.patterns.structural.decorator.decorator.WithDoubleCheese;
import ru.innopolis.stc13.patterns.structural.decorator.decorator.WithJalapeno;
import ru.innopolis.stc13.patterns.structural.decorator.pizza.PizzaRussian;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.innopolis.stc13.patterns.structural.decorator.*");
        Pizza pizza = context.getBean("pizzaRussian", PizzaRussian.class);
        WithCucumber withCucumber = context.getBean("withCucumber", WithCucumber.class);
        withCucumber.setPizza(pizza);
        WithJalapeno withJalapeno = context.getBean("withJalapeno", WithJalapeno.class);
        withJalapeno.setPizza(pizza);
        WithDoubleCheese withDoubleCheese = context.getBean("withDoubleCheese", WithDoubleCheese.class);
        withDoubleCheese.setPizza(pizza);
        System.out.println(pizza.getDescription() + " цена:" + pizza.cost());
    }
}