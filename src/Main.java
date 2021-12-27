/*
1. Klasse erstellen
2. Eigenschaften erstellen
3. Methoden erstellen
4. in die Main
5. Objekt erstellen
6. Methode über Objekt ausführen
*/

import LearningByRau.ArbeitenMitDateien.*;
import LearningByRau.OOP.*;
import LearningByRau.Grundlagen.*;
import LearningByRau.Übungen.*;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);
        Mensch mensch1 = new Mensch();

        mensch1.groeßeInCM = 175;
        mensch1.name = "Agon";
        //mensch1.geschlecht = "Mann";

        mensch1.arbeiten("Mann");


    }
}