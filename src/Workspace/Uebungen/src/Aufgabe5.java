package Workspace.Uebungen.src;

import java.util.*;

public class Aufgabe5 {

	public static void main(String[] args) {
		int[] muenzen = {200, 100, 50, 20, 10};
		int preis;
		char tarif;
		double einwurf = 0.0;
		Scanner eingabe = new Scanner(System.in);
		while(true)
		{
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
			
			if(preis < 0)
			{
				preis *= -1;
				int anzahl;
				for ( int i = 0; i < muenzen.length; i++)
				{
					anzahl = preis / muenzen[i];
					preis %= muenzen[i];
					if(anzahl > 0) 
						//System.out.println(anzahl + " * " + 
							//	muenzen[i] / 100.0 + " Euro");
						System.out.printf(" %2d mal %4.2f EURO%n", 
										anzahl, muenzen[i]/100.0);
				}// end for				
			}// end R�ckgabe
			
			System.out.println("Bitte entnehmen Sie Ihren Fahrschein");
			
		}// end while true
	}
}
