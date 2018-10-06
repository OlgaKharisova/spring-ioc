package ru.innopolis.stc13.patterns.creational.abstract_factory;

public class PizzaPeperoni extends Pizza {

    public PizzaPeperoni(String cheese) {
        super("regular", 40, false, cheese);
    }
}
