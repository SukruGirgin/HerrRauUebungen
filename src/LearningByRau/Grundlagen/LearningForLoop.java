package LearningByRau.Grundlagen;

import java.util.Scanner;

public class LearningForLoop {

    public void bspAufgabe() {
        for (int zähler = 1; zähler <= 10; zähler +=2) {
            System.out.println("Zähler: " + zähler);
        }
    }

    public void bspVerschachtelt() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public void aufgabe7() {

        int zahl = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (zahl < 9) {
                    zahl++;
                    System.out.print("0" + zahl + " ");
                } else {
                    zahl++;
                    System.out.print(zahl + " ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + (i < 10 ? "  " : " "));
            if (i % 10 == 0) System.out.println();
        }

        //Herr Rau
        for (int i = 1; i < 101; i++) {
            System.out.printf("%4d", i);
            //System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public void aufgabe2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("0 (Null) eingeben um abzubrechen!");

        for (int x = 1; x > 0; x++) {
            System.out.print("Zahl eingeben: ");
            int zahl = scan.nextInt();

            if (zahl > 0) {
                int fakultät = 1;
                for (int i = 1; i <= zahl; i++) {
                    fakultät *= i;
                }
                System.out.println(zahl + " ! = " + fakultät);
            } else {
                System.out.println("Ende des Programms!");
                break;
            }
        }
    }


}
