package ru.innopolis.stc13.patterns.structural.decorator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.innopolis.stc13.patterns.structural.decorator.decorator.WithCucumber;
import ru.innopolis.stc13.patterns.structural.decorator.decorator.WithDoubleCheese;
import ru.innopolis.stc13.patterns.structural.decorator.decorator.WithJalapeno;
import ru.innopolis.stc13.patterns.structural.decorator.pizza.PizzaRussian;

public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        Pizza pizza = beanFactory.getBean("pizzaRussian", PizzaRussian.class);

        WithCucumber withCucumber = beanFactory.getBean("withCucumber", WithCucumber.class);
        withCucumber.setPizza(pizza);
        WithJalapeno withJalapeno = beanFactory.getBean("withJalapeno", WithJalapeno.class);
        withJalapeno.setPizza(pizza);
        WithDoubleCheese withDoubleCheese = beanFactory.getBean("withDoubleCheese", WithDoubleCheese.class);
        withDoubleCheese.setPizza(pizza);
        System.out.println(pizza.getDescription() + " цена:" + pizza.cost());
    }
}