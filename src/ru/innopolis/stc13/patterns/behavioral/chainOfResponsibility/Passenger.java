package ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility;

public class Passenger {
   private boolean hasDocuments;
   private double cash;
   private boolean hasDrugs;

    public Passenger(boolean hasDocuments, double cash, boolean hasDrugs) {
        this.hasDocuments = hasDocuments;
        this.cash = cash;
        this.hasDrugs = hasDrugs;
    }

    public boolean isHasDocuments() {
        return hasDocuments;
    }

    public void setHasDocuments(boolean hasDocuments) {
        this.hasDocuments = hasDocuments;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public boolean isHasDrugs() {
        return hasDrugs;
    }

    public void setHasDrugs(boolean hasDrugs) {
        this.hasDrugs = hasDrugs;
    }
}
