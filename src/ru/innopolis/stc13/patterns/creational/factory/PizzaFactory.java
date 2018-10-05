package ru.innopolis.stc13.patterns.creational.factory;

public class PizzaFactory {
    Pizza createPizza(String pizzaType){
        switch (pizzaType){
            case "pepperoni":
                return new PizzaPepperoni(true);
            case "margarita":
                return new PizzaMargarita("testo",true);
        }
        return null;
    }
}
