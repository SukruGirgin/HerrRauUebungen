package Workspace.Kontrollstrukturen.src;

public class Iterationen {

	public static void main(String[] args) {
		//int zaehler = 1;
		
		// z�hlergesteuerte Schleife
		// wird eingesetzt, wenn die Anzahl der Wiederholungen beim Beginn der Schleife
		// bekannt ist
		for(int zaehler = 1; zaehler <= 10; zaehler += 2) // ++zaehler wenn um 1 hochgez�hlt wird
		{ 
			System.out.println("Z�hler: " + zaehler);
		}
		
		int x = 0;
		
		// kopfgesteuerte Schleife
		// wird eingesetzt, wenn die Anzahl der Wiederholungen beim Beginn der Schleife
		// unbekannt ist und die Anweisungen eventuell �berhaupt nicht durchlaufen werden
		// sollen
		while(x < 5) {
			System.out.println("x: " + x);
			++x;
		}
		
		int y = 7;
		
		// fu�gesteuerte Schleife
		// wird eingesetzt, wenn die Anzahl der Wiederholungen beim Beginn der Schleife
		// unbekannt ist und die Anweisungen mindestens einmal durchlaufen werden
		// sollen
		do {
			System.out.println("y: " + y);
			--y;
		} while(y > 0);
	}

}
