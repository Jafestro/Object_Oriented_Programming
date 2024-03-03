package module05.Task5_3.task01;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }

    // your code here
    private Color color;
    private boolean isCapOn = true;

    public Pen() {
        this.color = Color.RED;
    }
    public Pen(Color color) {
        this.color = color;
    }
    public String draw() {
        if (isCapOn) {
            return "";
        }
        return "Drawing " + color;
    }
    public void capOn() {
        isCapOn = true;
    }
    public void capOff() {
        isCapOn = false;
    }
    public void changeColor(Color color) {
        if (isCapOn) {
            this.color = color;
        }
    }
}
