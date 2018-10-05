package ru.innopolis.stc13.patterns.creational.builders.components;

public class TripComputer {
    private double fuelVolume;

    public TripComputer(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    @Override
    public String toString() {
        return "TripComputer{" +
                "fuelVolume=" + fuelVolume +
                '}';
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }
}
