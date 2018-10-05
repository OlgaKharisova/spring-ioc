package ru.innopolis.stc13.patterns.structural.adapter;

public class KeyboardsAdapter implements Keyboard {

    ChineseKeyboard chineseKeyboard;

    public KeyboardsAdapter() {}

    public KeyboardsAdapter(ChineseKeyboard keyboard) {
        this.chineseKeyboard = keyboard;
    }

    @Override
    public void tap(String code, Integer count) {
        for (int i =0; i < count; i++) {
            chineseKeyboard.chineseTap(code);
        }
    }
}