package LearningByRau.Grundlagen;

import java.util.Scanner;

public class LearningIfElse {

    String name = "Sükrü Girgin";
    String geschlecht = "Männlich";
    int uhrzeit = 13;


    public void übung1() {
        if (uhrzeit < 9) {
            if (geschlecht == "Männlich") {
                System.out.println("Guten Morgen Herr " + name);
            } else {
                System.out.println("Guten Morgen Frau " + name);
            }
        } else if (uhrzeit > 10 && uhrzeit < 17) {
            if (geschlecht == "Männlich") {
                System.out.println("Guten Tag Herr " + name);
            } else {
                System.out.println("Guten Tag Frau " + name);
            }
        } else if (uhrzeit > 18) {
            if (geschlecht == "Männlich") {
                System.out.println("Guten Abend Herr " + name);
            } else {
                System.out.println("Guten Abend Frau " + name);
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


}
