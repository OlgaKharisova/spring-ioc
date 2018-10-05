package GoF.adapter;

public class KeyboardUserImpl implements KeyboardUser {


    public KeyboardUserImpl() {
    }


    @Override
    public void useKeyboard(Keyboard keyboard) {
        keyboard.tap("A", 3);
        keyboard.tap("B", 5);
        keyboard.tap("¥", 6);

//        System.out.println();
    }
}
