package task;

public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean opened;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean opened) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.opened = opened;
    }

    public MyWindow() {
        this(1,2,0,"blue",false);
//        width = 1;
//        height = 2;
//        numberOfGlass = 0;
//        color = "blue";
    }

    public MyWindow(double width, double height) {
        this();
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }
//    public MyWindow(double width, double height, int numberOfGlass) {
//        this();
//        this.width = width;
//        this.height = height;
//        this.numberOfGlass = numberOfGlass;
//    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public void printFields() {
        System.out.println(this); // автоматически вызывается toString()
    }

    @Override
    public String toString() { // формируем текстовое представление объекта
        return width + " " + height + " " + numberOfGlass + " " + color + " " + opened;
    }
}
