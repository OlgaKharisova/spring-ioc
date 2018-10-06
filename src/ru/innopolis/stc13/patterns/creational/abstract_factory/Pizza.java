package ru.innopolis.stc13.patterns.creational.abstract_factory;

public abstract class Pizza {

    private String dough;
    private int diameter;
    private boolean thick;
    private String cheese;

    public Pizza(String dough, int diameter, boolean thick, String cheese) {
        this.dough = dough;
        this.diameter = diameter;
        this.thick = thick;
        this.cheese = cheese;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isThick() {
        return thick;
    }

    public void setThick(boolean thick) {
        this.thick = thick;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", diameter=" + diameter +
                ", thick=" + thick +
                ", cheese='" + cheese + '\'' +
                '}';
    }
}
