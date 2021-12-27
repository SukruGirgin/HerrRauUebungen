package Workspace.Uebungen.src;

import java.util.Scanner;

public class Uebung_7_4 {

	public static void main(String[] args) {
		final int MONTAG = 1;
		final int DIENSTAG = 2;
		final int MITTWOCH = 3;
		final int DONNERSTAG = 4;
		final int FREITAG = 5;
		final int SAMSTAG = 6;
		final int SONNTAG = 7;
		
		final int JANUAR = 1;
		final int FEBRUAR = 2;
		final int MAERZ = 3;
		final int APRIL = 4;
		final int MAI = 5;
		final int JUNI = 6;
		final int JULI = 7;
		final int AUGUST = 8;
		final int SEPTEMBER = 9;
		final int OKTOBER = 10;
		final int NOVEMBER = 11;
		final int DEZEMBER = 12;
		
		int letzterTagImJahr = SONNTAG;
		boolean schaltjahr = true;
		int anzahlTageImMonat = 0;
		int anzahlTageImJahr = 1;
		int ersterSonntagImJahr = SONNTAG - letzterTagImJahr;
		
		for ( int monat = 1; monat < 13; ++monat) {
			if(monat == 1 && ersterSonntagImJahr == 1) {
				System.out.printf("Der 01.%02d. des Jahres ist ein Sonntag.\n", 
					monat);
			} else if(monat > 1 && anzahlTageImJahr % 7 == 0) {
				System.out.printf("Der 01.%02d. des Jahres ist ein Sonntag.\n", 
					monat);
			}
			switch(monat) {
			case JANUAR:
				anzahlTageImMonat = 31 - ersterSonntagImJahr;
				break;
			case MAERZ:
			case MAI:
			case JULI:
			case AUGUST:
			case OKTOBER:
			case DEZEMBER:
				anzahlTageImMonat = 31;
				break;
			case APRIL:
			case JUNI:
			case SEPTEMBER:
			case NOVEMBER:
				anzahlTageImMonat = 30;
				break;
			case FEBRUAR:
				anzahlTageImMonat = schaltjahr ? 29 : 28;
			}
			anzahlTageImJahr += anzahlTageImMonat;	
			
			
		}
		
		

	}

}
