package ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility;

public class Customs {

    private int capacity;
    private int busy;

    public Customs(int capacity, int busy) {
        this.capacity = capacity;
        this.busy = busy;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBusy() {
        return busy;
    }

    public void setBusy(int busy) {
        this.busy = busy;
    }
}
