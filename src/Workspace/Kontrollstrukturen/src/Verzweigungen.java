package Workspace.Kontrollstrukturen.src;

public class Verzweigungen {

	public static void main(String[] args) {
		int a = 5, b = 10;

		System.out.println("einseitige Verzweigung:");
		if (a == 5 && b == 10) {
			System.out.println("a: " + a + "\tb: " + b);
		}

		System.out.println("nach einseitiger Verzweigung");

		System.out.println("zweiseitige Verzweigung:");
		if (a < 100) {
			System.out.println("a: " + a);
		} else {
			System.out.println("else-Zweig");
			a = 300;
			b = 50;
		}

		if (a == 5 && b == 10) {
			System.out.println("a: " + a + "\tb: " + b);
		} else {
			if (a == 5) {
				System.out.println("a: " + a);
			} else {
				if (b == 10) {
					System.out.println("b: " + b);
				} else {
					System.out.println("ung�ltiger Wert");
				}
			}
		}
		
		if(a==5 && b == 10) {
			System.out.println("a: " + a + "\tb: " + b);
		} else if(a==5) {
			System.out.println("a: " + a);
		} else if(b==10) {
			System.out.println("b: " + b);
		} else {
			System.out.println("ung�ltiger Wert");
		}
		
		int note = 2;
		
		switch (note) {
		case 1:
				System.out.println("sehr gut");
				break;
		case 2:
				System.out.println("gut");
				break;
		case 3:
				System.out.println("befriedigend");
				break;
		case 4:
				System.out.println("ausreichend");
				break;
		case 5:
				System.out.println("mangelhaft");
				break;
		case 6:
				System.out.println("ungen�gend");
				break;
		default:
				System.out.println("ung�ltige Note");
		}

		switch (note) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("bestanden");
			break;
		case 5:
		case 6:
			System.out.println("nicht bestanden");
			break;
		default:
			System.out.println("ung�ltige Note");
		}
		
		switch (note) {
		case 5:
		case 6:
			System.out.print("nicht ");
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("bestanden");
			break;
		default:
			System.out.println("ung�ltige Note");
		}
		
	}

}
