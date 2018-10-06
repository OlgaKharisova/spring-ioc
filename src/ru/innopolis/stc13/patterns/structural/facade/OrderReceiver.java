package ru.innopolis.stc13.patterns.structural.facade;

public class OrderReceiver {
    public boolean acceptOrder(String dishName) {
        if ("pizza".equals(dishName)) {
            return true;
        } else {
            return false;
        }
    }
}