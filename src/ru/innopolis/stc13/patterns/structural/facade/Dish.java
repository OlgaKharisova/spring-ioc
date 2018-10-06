package ru.innopolis.stc13.patterns.structural.facade;

public class Dish {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void cook() {
        System.out.println("cook the dish");
    }
}
