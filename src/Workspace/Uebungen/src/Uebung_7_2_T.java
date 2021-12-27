package Workspace.Uebungen.src;

public class Uebung_7_2_T {

	public static void main(String[] args) {
		// einzeiliger Kommentar
		/*
		 *  mehrzeiliger Kommentar
		 */
		int a = 9, b=17, c= 18;
		String name = "Reza";
		char geschlecht = 'm';
		
		System.out.println("vor if()");
//		if(a == 9) {
//			if(b==17) {
//				if(c == 18) {
//					
//				} else {
//					System.out.println(c);
//				}
//			} else {
//				System.out.println(b);
//			}
//		} else {
//			System.out.println(a);
//		}
		
		
		int tageszeit = 23;
		System.out.println("vor switch");
		switch (tageszeit) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		System.out.println("guten Morgen");
		if(geschlecht == 'm') {
			System.out.print("Herr ");
		} else {
			System.out.print("Frau ");
		}
		System.out.println(name);
		break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		System.out.println("Guten Tag");
		if(geschlecht == 'm') {
			System.out.print("Herr ");
		} else {
			System.out.print("Frau ");
		}
		System.out.println(name);
		break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		System.out.print("Guten Abend ");
		if(geschlecht == 'm') {
			System.out.print("Herr ");
		} else {
			System.out.print("Frau ");
		}
		System.out.println(name);
//		System.out.println(geschlecht);

		}
	}

}
