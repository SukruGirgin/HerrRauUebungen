package Workspace.Datentypen.src;

public class DoubleUngenauigkeit {

	public static void main(String[] args) {
		double x = 1;
	
		
		for(int i = 0; i < 10; ++ i) {
			x -= 0.1;
			System.out.println(x);
		}
		
		if(x == 0) {
			System.out.println(0);
		} else {
			System.out.println("x ist != 0");
		}

	}

}
