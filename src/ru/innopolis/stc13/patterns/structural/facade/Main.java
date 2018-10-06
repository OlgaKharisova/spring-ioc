package ru.innopolis.stc13.patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish("pizza");
        new PizzaCookingFacade().cook(dish);
    }
}
