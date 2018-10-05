package GoF.adapter;

public class ChineseKeyboard {

    String buttonCount;

    public ChineseKeyboard() {
    }

    public ChineseKeyboard(String buttonCount) {
        this.buttonCount = buttonCount;
    }

    public String getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(String buttonCount) {
        this.buttonCount = buttonCount;
    }

    void chineseTap(String button) {
        System.out.println(button+ " chinesePressed");
    }
}
