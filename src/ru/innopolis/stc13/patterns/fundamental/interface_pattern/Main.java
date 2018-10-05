package ru.innopolis.stc13.patterns.fundamental.interface_pattern;

public class Main {
    public static void main(String[] args) {
        Figure figure = new FigureIml();
        meth(figure);
        meth2(figure);
        meth3(figure);
    }

    private static void meth(Figure figure) {
        figure.draw();
        figure.setSize(4);
    }

    private static void meth2(Drawable drawable) {
        drawable.draw();
    }

    private static void meth3(Sizeble sizeble) {
        sizeble.setSize(7);
    }
}
