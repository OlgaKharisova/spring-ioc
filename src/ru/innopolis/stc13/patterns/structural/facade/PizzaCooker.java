package ru.innopolis.stc13.patterns.structural.facade;

public class PizzaCooker {
    public boolean cookPizza(String dishName) {
        if ("pizza".equals(dishName)) {
            return true;
        } else {
            return false;
        }
    }
}
