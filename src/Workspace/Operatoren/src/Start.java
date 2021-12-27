package Workspace.Operatoren.src;

public class Start {
	
	public static void main(String[] args) {
		int wert1 = 1025, wert2 = 5;
		double erg;
		// Arithmetische Operatoren
		// +, -, *, /, %
		erg = wert1 % wert2; //wert1 / wert2 = ergebnis Rest irgendwas
		// 14 / 5 = 2 Rest 4
		// 14 % 5 = 4
		// 10 / 5 = 2 Rest 0   x % y == 0
	
		System.out.println(erg);
		// Inkrement und Dekrement-Operator
		// ++, --
		++wert1;
		wert1++;
		wert1 = 30;
		
		erg = wert1++ * wert2;
		System.out.println("Das Ergebnis ist: " + erg);
		System.out.println("Wert1: " + wert1);
		
		erg = ++wert1 * wert2;
		System.out.println("Das Ergebnis ist: " + erg);
		System.out.println("Wert1: " + wert1);
		
		// relationalen Operatoren (Vergleichsoperatoren)
		// <, <=, >, >=, ==, !=
		boolean ok = wert1 >= wert2;
		
		System.out.println("ok = " + ok);
		
		// logische Operatoren
		// && (& und), || (| oder), ^ (exclusive oder XOR), ! (not)
		
		ok = wert1 > 31 ^ (wert2 < 100 && wert1 == wert2);
		
		System.out.println(" wert1 > 31 ^ wert2 < 100 ^ wert1 == wert2 = " + ok);
		
		// =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
		
		erg += 5;  // erg = erg + 5;
		
		erg *= 5 + 6; // erg = erg * (5 + 6) und nicht erg = erg * 5 + 6
		
		
	}

}
