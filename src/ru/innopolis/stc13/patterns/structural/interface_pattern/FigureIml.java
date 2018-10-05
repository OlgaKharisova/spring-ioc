package ru.innopolis.stc13.patterns.structural.interface_pattern;

public class FigureIml implements Figure {
    @Override
    public void draw() {
        System.out.println("Рисую");
    }

    @Override
    public void setSize(int size) {
        System.out.println("Размер " + size);
    }
}

