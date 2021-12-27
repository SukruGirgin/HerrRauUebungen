package LearningByRau.Übungen;
import java.util.Scanner;

public class AufgabenDoc150921 {

    public void aufgabe1() {

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

    public void aufgabe3() {

    }

    public void aufgabe4() {

    }


    public void aufgabe5() {

        Scanner scan = new Scanner(System.in);

        double a = 1.80;
        double ab = 3.20;
        double b = 2.00;

        double bezahlt = 0;
        int tarifWahl;


        for (int i = 1; i > 0; i++) {
            System.out.println("Verfügbare Tarifbereiche: ");
            System.out.println("Tarif 1 kostet 1.80€.");
            System.out.println("Tarif 2 kostet 3.20€.");
            System.out.println("Tarif 3 kostet 2.00€.");
            System.out.print("Tarifwahl (in ganzer Zahl 1-3 angeben): ");
            tarifWahl = scan.nextInt();

            if (tarifWahl == 1) {
                System.out.println();
                System.out.println("Tarifbereich A kostet: " + a);
                System.out.println("Sie können mit der Auswahl unten Zahlen:");
                System.out.println("20€, 10€, 5€, 2€, 1€, 50ct, 20ct, 10ct");
                System.out.print("Hier Geld angeben: ");
                bezahlt = scan.nextDouble();
                while (bezahlt <= a) {
                    System.out.print("Hier Geld angeben: ");
                    bezahlt = bezahlt + scan.nextDouble();
                    if (bezahlt <= a) {
                        System.out.print("Hier Geld angeben: ");
                        bezahlt = bezahlt + scan.nextDouble();
                    }
                }
                if (bezahlt >= a) {
                    double wechselGeld = bezahlt - a;
                    System.out.println("Ticket wurde gezahlt. Ticket wird gedruckt...");
                    System.out.println("Wechselgeld beträgt: " + wechselGeld + "0€");
                    break;
                } else {
                    System.out.print("Hier Geld angeben: ");
                    bezahlt = bezahlt + scan.nextDouble();
                }
            }

            if (tarifWahl == 2) {
                System.out.println("Tarifbereich A kostet: " + ab);
                System.out.println("Sie können mit der Auswahl unten Zahlen:");
                System.out.println("20€, 10€, 5€, 2€, 1€, 50ct, 20ct, 10ct");
                System.out.print("Hier Geld angeben: ");
                bezahlt = scan.nextDouble();
                while (bezahlt < ab) {
                    System.out.print("Hier Geld angeben: ");
                    bezahlt = bezahlt + scan.nextDouble();
                    if (bezahlt < ab) {
                        System.out.print("Hier Geld angeben: ");
                        bezahlt = bezahlt + scan.nextDouble();
                    }
                }
                if (bezahlt >= ab) {
                    double wechselGeld = bezahlt - ab;
                    System.out.println("Ticket wurde gezahlt. Ticket wird gedruckt...");
                    System.out.println("Wechselgeld beträgt: " + wechselGeld + "0€");
                    break;
                } else {
                    System.out.print("Hier Geld angeben: ");
                    bezahlt = bezahlt + scan.nextDouble();
                }
            }

            if (tarifWahl == 3) {
                System.out.println("Tarifbereich A kostet: " + b);
                System.out.println("Sie können mit der Auswahl unten Zahlen:");
                System.out.println("20€, 10€, 5€, 2€, 1€, 50ct, 20ct, 10ct");
                System.out.print("Hier Geld angeben: ");
                bezahlt = scan.nextDouble();
                while (bezahlt < b) {
                    System.out.print("Hier Geld angeben: ");
                    bezahlt = bezahlt + scan.nextDouble();
                    if (bezahlt < b) {
                        System.out.print("Hier Geld angeben: ");
                        bezahlt = bezahlt + scan.nextDouble();
                    }
                }
                if (bezahlt >= b) {
                    double wechselGeld = bezahlt - b;
                    System.out.println("Ticket wurde gezahlt. Ticket wird gedruckt...");
                    System.out.println("Wechselgeld beträgt: " + wechselGeld + "0€");
                    break;
                } else {
                    System.out.print("Hier Geld angeben: ");
                    bezahlt = bezahlt + scan.nextDouble();
                }
            }
        }
    }


    public void aufgabe6(int beschäftigungsDauer, boolean programmierer) {
        String pcModell = "";

        if (beschäftigungsDauer < 3 && programmierer == true) {
            pcModell = "486er PC";
        } if (beschäftigungsDauer < 3 && programmierer == false) {
            pcModell = "386er PC";
        } if (beschäftigungsDauer >= 3 && programmierer == true) {
            pcModell = "Pentium-Rechner";
        } if (beschäftigungsDauer >= 3 && programmierer == false) {
            pcModell = "MAC";
        }

        System.out.println("Beschäftigungsdauer: " + beschäftigungsDauer + " Jahre und Programmierer: " + programmierer +
            ". Deshalb Erhaltener PC: " + pcModell);
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


}
