package LearningByRau.Grundlagen;

public class LearningWhileLoop {

    int x = 0;

    public void bspWhileLoop() {
        while (x < 5) {
            System.out.println("X: " + x);
            ++x;
        }
    }

    public void bspDoWhileLoop() {
        do {
            System.out.println("X: " + x);
            ++x;
        } while (x < 5);
    }


    //S. 86 Aufgabe 3
    public void übung1(){
        int zahl = 1025;
        int zähler = 0;

        while (zahl % 5 == 0) {
            ++zähler;
            zahl /= 5; // zahl = zahl / 5;
        }

        System.out.println("Die Zahl ist " + zähler + " mal durch 5 teilbar");
    }
}
