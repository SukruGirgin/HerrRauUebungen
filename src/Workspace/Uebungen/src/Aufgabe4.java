package Workspace.Uebungen.src;

import java.util.Scanner;


public class Aufgabe4 {


	public static void main(String[] args) {
		double operand1 = 0.0, operand2 = 0.0, ergebnis = 1.0;
		char operator;
		Scanner eingabe = new Scanner(System.in);
		
//		System.out.print("Bitte erste Zahl eingeben: ");
		operand1 = Double.parseDouble(args[0]);
//		System.out.print("Bitte Operator eingeben: ");
		operator = args[1].charAt(0);
		
		if (operator != '!')
		{
//			System.out.print("Bitte zweite Zahl eingeben: ");
			operand2 = Double.parseDouble(args[2]);
		}
			
		switch(operator)
		{
		case '+':
			ergebnis = operand1 + operand2;
			break;
		case '-':
			ergebnis = operand1 - operand2;
			break;
		case '/':
			if (operand2 != 0) 
				ergebnis = operand1 / operand2;
			else
				System.out.println("Division durch 0");
				System.exit(-2);
			break;
		case '*':
			ergebnis = operand1 * operand2;
			break;
		case '!':
			for ( int i = 1; i <= operand1; i++)
				ergebnis *= i;
			break;
		case 'p':
		case 'P':
			for ( int i = 1; i <= operand2; i++)
				ergebnis *= operand1;
			break;
		default:
			System.out.println("ung�ltiger Operator");
			System.exit(-1);
		}
		if( operator != '!')
			System.out.println(operand1 + " " + 
			((operator != 'p' && operator != 'P')? 
				operator : '^') +
			" " + operand2 + " = " + ergebnis);
		else
			System.out.println("" + operand1 +  
					operator + " = " +	ergebnis);
	}

}
