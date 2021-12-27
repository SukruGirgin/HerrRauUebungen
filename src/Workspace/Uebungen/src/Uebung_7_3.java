package Workspace.Uebungen.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uebung_7_3 {

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

	public static void main(String[] args)

	{
		int zahl = 0;
		//zahl = readInt("Bitte Zahl eingeben!");
		zahl = 1025;
		int counter = 0;
		while(zahl % 5 == 0) {
			++counter;
			zahl /= 5;  // zahl = zahl / 5;
		}

		System.out.println("Die Zahl ist " + counter + " mal durch 5 teilbar");
	}

}
