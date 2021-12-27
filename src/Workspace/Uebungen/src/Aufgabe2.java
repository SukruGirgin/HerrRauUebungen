package Workspace.Uebungen.src;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		double ergebnis = 1.0, zahl=1.0;
		System.out.print("Bitte Zahl eingeben: ");
		Scanner eingabe = new Scanner(System.in);
		zahl = eingabe.nextDouble();
		
		for ( int i = 1; i <= zahl; i++) {
			ergebnis *= i;  
			// ergebnis = ergebnis * i
		}
		
		System.out.println(zahl + "! = " + ergebnis);
	}

}
