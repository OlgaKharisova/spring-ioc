package ru.innopolis.stc13.patterns.creational.builders.cars;

import ru.innopolis.stc13.patterns.creational.builders.components.Engine;
import ru.innopolis.stc13.patterns.creational.builders.components.TripComputer;
import ru.innopolis.stc13.patterns.creational.builders.components.Wheels;

public class Car {
    private Engine engine;
    private Wheels wheels;
    private int weelsQty;
    private int capacity;
    private int doorsQty;
    private TripComputer computer;

    public Car(Engine engine, Wheels wheels, int weelsQty, int capacity, int doorsQty, TripComputer computer) {
        this.engine = engine;
        this.wheels = wheels;
        this.weelsQty = weelsQty;
        this.capacity = capacity;
        this.doorsQty = doorsQty;
        this.computer = computer;
    }

    public TripComputer getComputer() {
        return computer;
    }

    public void setComputer(TripComputer computer) {
        this.computer = computer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public int getWeelsQty() {
        return weelsQty;
    }

    public void setWeelsQty(int weelsQty) {
        this.weelsQty = weelsQty;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDoorsQty() {
        return doorsQty;
    }

    public void setDoorsQty(int doorsQty) {
        this.doorsQty = doorsQty;
    }
}
