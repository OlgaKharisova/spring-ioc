package ru.innopolis.stc13.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new KeyboardImpl(4);
        KeyboardUser keyboardUser = new KeyboardUserImpl();
        keyboardUser.useKeyboard(keyboard);
        ChineseKeyboard chineseKeyboard = new ChineseKeyboard("1");
        System.out.println("_________________________");
        KeyboardsAdapter keyboardsAdapter = new KeyboardsAdapter(chineseKeyboard);
        keyboardUser.useKeyboard(keyboardsAdapter);

    }
}
