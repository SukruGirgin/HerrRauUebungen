package Workspace.Uebungen.src;

import java.util.Scanner;

public class Aufgabe5_ohne_Array {

	public static void main(String[] args) {
		int preis;
		char tarif;
		double einwurf = 0.0;
		Scanner eingabe = new Scanner(System.in);
		
		while(true) {
			
			preis = 0;
			while(preis == 0)
			{
				System.out.println("Tarif A\t\t 3,40 EURO");
				System.out.println("Tarif B\t\t 4,80 EURO");
				System.out.println("Tarif C\t\t 5,60 EURO");
				System.out.println("Bitte w�hlen Sie einen Tarif aus");
				tarif = eingabe.next().charAt(0);
				
				switch(tarif)
				{
				case 'a':
				case 'A':
					preis = 340;
					break;
				case 'b':
				case 'B':
					preis = 480;
					break;
				case 'c':
				case 'C':
					preis = 560;
					break;
				case 'q':
				case 'Q':
					System.exit(0);
				default:
					System.out.println("ung�ltiger Tarif");

				} // end switch
			}// end while preis ==  0
			
			do
			{
				System.out.printf("Bitte werfen Sie " +
						"%6.2f EURO ein: ", preis / 100.0);
				einwurf = eingabe.nextDouble();
				if(einwurf != 0.1 && einwurf != 0.2 
						&& einwurf != 0.5 && einwurf != 1.0 && 
						einwurf != 2.0 && einwurf != 5.0 && 
						einwurf != 10.0 && einwurf != 20.0 && 
						einwurf != 50.0 )
				{
					System.out.println("Wir nehmen kein Falschgeld");
					continue;
				}
				preis -= einwurf * 100.0;
			}while ( preis > 0);
			
			if(preis < 0) {
				int muenzen = 0;
				preis *= -1;
				muenzen = preis / 200;  // 440 / 200 = 2
				if(muenzen != 0) System.out.println("" + muenzen + " mal 2,00 �");
				preis %= 200;
				
				muenzen = preis / 100;  // 40 / 100 = 0
				if(muenzen != 0) System.out.println("" + muenzen + " mal 1,00 �");
				preis %= 100;
				
				muenzen = preis / 50;  // 40 / 50 = 0
				if(muenzen != 0) System.out.println("" + muenzen + " mal 0,50 �");
				preis %= 50;
				
				muenzen = preis / 20;  // 40 / 20 = 2
				if(muenzen != 0) System.out.println("" + muenzen + " mal 0,20 �");
				preis %= 20;
				
				muenzen = preis / 10;  // 0 / 10 = 0
				if(muenzen != 0) System.out.println("" + muenzen + " mal 0,10 �");
				System.out.println("Bitte R�ckgeld entnehmen");
			}
			System.out.println("Bitte Fahrschein entnehmen");
			
		}

	}

}
