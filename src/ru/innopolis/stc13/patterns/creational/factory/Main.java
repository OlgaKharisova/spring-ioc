package ru.innopolis.stc13.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza("pepperoni");
        System.out.println(pizza);
        Pizza pizza2 = pizzaFactory.createPizza("margarita");
        System.out.println(pizza2);
    }
}
