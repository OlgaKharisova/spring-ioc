package ru.innopolis.stc13.patterns.creational.abstract_factory;

public class NYFactory extends AbstractFactory {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "peperoni":
                return new PizzaPeperoni("NY parmezan");
            case "margarita":
                return new PizzaMargarita("NY gouda");
            default:
                return null;
        }
    }
}
