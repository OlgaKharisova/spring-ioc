package ru.innopolis.stc13.patterns.creational.abstract_factory;


public class CaliforniaFactory extends AbstractFactory {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "peperoni":
                return new PizzaPeperoni("california parmezan");
            case "margarita":
                return new PizzaMargarita("california gouda");
            default:
                return null;
        }
    }
}
