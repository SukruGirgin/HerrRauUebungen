package Workspace.Uebungen.src;

public class Aufgabe7 {
	public static void main(String[] args)
	{
		/*
		for(int i = 0; i < 10; i++ )
		{
			for(int j=1; j < 11; j++)
				System.out.print(i*10 + j + "  ");
			System.out.println();
		}
		*/
		
		for(int i = 1; i < 101; i++)
		{
			System.out.printf("%4d", i);
			//System.out.print(i + "   ");
		
			if (i % 10 == 0) {
				System.out.println();
			}
			
//			if (i % 10 == 0) System.out.println();
			
		}
	}
}
