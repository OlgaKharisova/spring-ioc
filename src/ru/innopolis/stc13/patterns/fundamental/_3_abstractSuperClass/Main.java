package ru.innopolis.stc13.patterns.fundamental._3_abstractSuperClass;

public class Main {
    public static void main(String[] args) {
            Parent parent = new Circle();
            parent.color("Красный");
            parent.figure();
            Parent parent1 = new Trangle();
            parent1.color("Черный");
            parent.figure();
    }
}
