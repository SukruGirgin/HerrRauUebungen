package Workspace.Uebungen.src;

import java.util.*;

public class Aufgabe6 {


	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Ist der Mitarbeiter Programmierer (j/n)?");
		char progr = eingabe.nextLine().toLowerCase().charAt(0);
		System.out.println("Wie lange ist der Mitarbeiter bereits im Betrieb?");
		double jahre = eingabe.nextDouble();
		
		if (progr == 'j' && jahre < 3.0)
			System.out.println("486er");
		else if (progr == 'j' && jahre >= 3.0)
			System.out.println("Pentium");
		else if (progr == 'n' && jahre < 3.0)
			System.out.println("386er");
		else 
			System.out.println("MAC");
		
		// alternativ
		
		if( progr == 'j') {
			if ( jahre < 3.0)
				System.out.println("486er");
			else
				System.out.println("Pentium");
		}
		else {
			if ( jahre < 3.0)
				System.out.println("386er");
			else
				System.out.println("MAC");
		}
		
		
//		funktioniert nicht jahre nicht int-kompatibel, case < nicht erlaubt
//		case muss konstanter Wert sein
//		switch(jahre) {
//		case < 3:
//			break;
//		}
		
		
		switch(progr) {
		case 'j':
			if ( jahre < 3.0)
				System.out.println("486er");
			else
				System.out.println("Pentium");
			break;
		case 'n':
			if ( jahre < 3.0)
				System.out.println("386er");
			else
				System.out.println("MAC");
			break;
		default:
		}
	}

}
