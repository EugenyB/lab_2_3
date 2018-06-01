package lab23;

import task.MyWindow;

public class Main {

    public static void main(String[] args) {
        MyWindow w1 = new MyWindow();
        MyWindow w2 = new MyWindow(1, 1.75);
        MyWindow w3 = new MyWindow(2, 1.75, 3, "black", true);
        MyWindow w4 = new MyWindow(3, 2, 1);
        MyWindow w5 = new MyWindow(10, 17.5, 11, "pink", true);

        MyWindow[] windows = {w1, w2, w3, w4, w5};

//        w1.printFields();
//        windows[0].printFields();
        // выводим информацию о всех окнах
        for (MyWindow window : windows) {
            window.printFields();
        }


        MyWindow w6 = new MyWindow();
        w6.printFields();
    }
}
