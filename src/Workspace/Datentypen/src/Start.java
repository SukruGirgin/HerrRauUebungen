package Workspace.Datentypen.src;

public class Start {
	
	public static void main(String[] args) {
		byte  erstesByte, zweitesByte;  // 1 Byte
		short ersterShort = 2133;       // 2 Bytes
		int   ersterInt;				// 4 Bytes
		long  ersterLong; 				// 8 Bytes
		
		float ersterFloat;				// 4 Bytes
		double ersterDouble;			// 8 Bytes
		
		boolean ok;						// 1 Byte (true oder false)
		
		char ersterChar;				// 2 Bytes
		
		erstesByte = 127;
		zweitesByte = erstesByte;
		
		System.out.println(zweitesByte);
		
		ersterLong = 13212368787L;
		
		ersterFloat = 45.7F;
		ersterDouble = 876.87;
		
		ok = true;
		
		ersterChar = 'A';
		System.out.println(ersterChar);
		
		ersterChar = 49;
		System.out.println(ersterChar);
		
		ersterChar = '\n';
		System.out.println(ersterChar);
		
		ersterChar = '\\';
		System.out.println(ersterChar);
		
		ersterChar = '\u0041';
		System.out.println(ersterChar);
		
		
		System.out.println("c:\\windows\\system");
		
		ersterInt = 0xff10ab;
		System.out.println(ersterInt);
		ersterInt = 012357;
		
		System.out.println(ersterInt);
		ersterInt = 12;
		
	}

}
