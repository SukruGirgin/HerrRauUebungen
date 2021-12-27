package Workspace.Uebungen.src;//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

import java.io.*;

public class Aufgabe1 {

	public static int readInt(String text) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(text + ": ");
		try {
			return Integer.parseInt(in.readLine());
		}

		// Fehlerbehandlung
		catch (IOException e) {
			System.out.println("IO error");
			return 1;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat error");
			return 1;
		}
	}

	public static void main(String[] args) {
		double summe = 0;
		int zahl = 0;
		int anzahl = 0;
		double mittelwert = 0.0;
		
		do {
			zahl = readInt("Bitte Zahl eingeben");
			summe = summe + zahl;
			++anzahl;
		} while (zahl != 0);
		
		--anzahl;
		
		System.out.println("Die Summe war: " + summe);
		if(anzahl > 0) {
			mittelwert = summe / anzahl;
			System.out.println("Der Mittelwert ist: " + mittelwert);
		}
		
		

	}

}
