package ru.innopolis.stc13.patterns.creational.builders.director;

import ru.innopolis.stc13.patterns.creational.builders.builders.Builder;
import ru.innopolis.stc13.patterns.creational.builders.components.Engine;
import ru.innopolis.stc13.patterns.creational.builders.components.TripComputer;
import ru.innopolis.stc13.patterns.creational.builders.components.Wheels;

public class Director {

    public void constructRace(Builder builder) {
        builder.setWheels(Wheels.SLICKS_WEELS);
        builder.setComputer(new TripComputer(120));
        builder.setEngine(new Engine(true, 100, 0));
        builder.setWeelsQty(6);
    }

    public void constructRoad(Builder builder) {
        builder.setWheels(Wheels.TRACK_WHEELS);
        builder.setComputer(new TripComputer(40));
        builder.setEngine(new Engine(true, 30, 10_000));
        builder.setWeelsQty(4);
    }

    public void constructDirth(Builder builder) {
        builder.setWheels(Wheels.DIRT_WEELS);
        builder.setComputer(new TripComputer(20));
        builder.setEngine(new Engine(true, 60, 100));
        builder.setWeelsQty(4);
    }
}
