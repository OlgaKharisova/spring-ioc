package ru.innopolis.stc13.patterns.creational.builders.builders;

import ru.innopolis.stc13.patterns.creational.builders.cars.Bike;
import ru.innopolis.stc13.patterns.creational.builders.components.Engine;
import ru.innopolis.stc13.patterns.creational.builders.components.TripComputer;
import ru.innopolis.stc13.patterns.creational.builders.components.Wheels;

public class BikeBuilder implements Builder {
    private Engine engine;
    private Wheels wheels;
    private int weelsQty;
    private TripComputer computer;

    public Engine getEngine() {
        return engine;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    @Override
    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public int getWeelsQty() {
        return weelsQty;
    }

    @Override
    public void setWeelsQty(int weelsQty) {
        this.weelsQty = weelsQty;
    }

    public TripComputer getComputer() {
        return computer;
    }

    @Override
    public void setComputer(TripComputer computer) {
        this.computer = computer;
    }

    public Bike getResult() {
        return new Bike(engine, wheels, weelsQty, computer, false);
    }

    @Override
    public String toString() {
        return "BikeBuilder{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", weelsQty=" + weelsQty +
                ", computer=" + computer +
                '}';
    }
}
