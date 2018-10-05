package ru.innopolis.stc13.patterns.creational.builders.components;

public class Engine {
    private final double volume;
    private boolean started;
    private double mileage;

    public Engine(boolean started, double volume, double mileage) {
        this.started = started;
        this.volume = volume;
        this.mileage = mileage;
    }

    public Engine() {
        volume = 0.0;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "started=" + started +
                ", volume=" + volume +
                ", mileage=" + mileage +
                '}';
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public double getVolume() {
        return started ? volume : 0.0;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
