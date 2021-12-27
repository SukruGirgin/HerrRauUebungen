package Workspace.Uebungen.src;

public class Uebung_7_2 {

	public static void main(String[] args) {
		String name = "Reza"; 
		char geschlecht = 'm';
		int tageszeit = 9;
		
		if(tageszeit >= 0 && tageszeit <= 9) {
			System.out.print("Guten Morgen ");
		} else if(tageszeit >= 10 && tageszeit <= 17) {
			System.out.print("Guten Tag ");
		} else if(tageszeit >=18 && tageszeit <= 23) {
			System.out.print("Guten Abend ");
		} else {
			System.out.println("ung�ltige Tageszeit");
		}
		
		if (geschlecht == 'm') {
			System.out.print("Herr ");
		} else {
			System.out.print("Frau ");
		}
		
//		switch(geschlecht) {
//		case 'm':
//			System.out.print("Herr ");
//			break;
//		case 'w':
//			System.out.print("Frau ");
//			break;
//		}

		System.out.println(name);
	}

}
