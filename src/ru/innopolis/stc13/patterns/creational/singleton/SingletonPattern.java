package ru.innopolis.stc13.patterns.creational.singleton;

public class SingletonPattern {

    private static SingletonPattern ourInstance = null;

    private SingletonPattern() {
    }


    public static SingletonPattern getInstance() {
        synchronized (SingletonPattern.class) {
            if (ourInstance == null) {
                ourInstance = new SingletonPattern();
            }
        }
        return ourInstance;
    }
}
