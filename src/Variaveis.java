
public class Variaveis {
	public static void main(String[] args) {
		
		int varInt = 2147483647;  // 4 bytes
		System.out.println(varInt);
		System.out.println("Integer\n"+"Maior valor: " + Integer.MAX_VALUE);
		System.out.println("Menor valor: "+ Integer.MIN_VALUE+"\n");
		
		long varLong = 9223372036854775807L;  // 8 bytes
		System.out.println(varLong);
		System.out.println("Long\n"+"Maior valor: "+ Long.MAX_VALUE);
		System.out.println("Menor valor: "+ Long.MIN_VALUE+"\n");
		
		
		short varShort = 32767; // 2 bytes
		System.out.println(varShort);
		System.out.println("Short\n"+"Maior valor: "+ Short.MAX_VALUE );
		System.out.println("Menor valor: "+ Short.MIN_VALUE+"\n");
		
		
		byte  varByte = 127;// 1 bytes
		System.out.println(varByte);
		System.out.println("Byte\n"+"Maior Valor: " + Byte.MAX_VALUE);
		System.out.println("Menor valor: "+ Byte.MIN_VALUE+"\n");
		
		/*Variaves reais Pontos.Flutuantes*/
		
		float varFloat = 12.1f; //8 bytes
		System.out.println(varFloat);
		System.out.println("Float\n"+"Maior valor: "+ Float.MAX_VALUE);
		System.out.println("Menor valor: "+ Float.MIN_VALUE+"\n");
		
		double varDouble = 32;
		System.out.println(varDouble);
		System.out.println("Double\n"+"Maior valor: "+ Double.MAX_VALUE);
		System.out.println("Menor valor: "+ Double.MIN_VALUE+"\n");
		
		
		// Outras Variaveis
		
		//Boolean
		boolean varBoolean = true; // 1 bit
		System.out.println(varBoolean);
		
		
		// Char - Também trabalha com a tabela ASCII
		char varChar = 'a';
		System.out.println(varChar);
		varChar = 221;
		System.out.println(varChar);
					
		// String
		String varString = "Uma palavra ou uma frase...";
		varString = varString + " Ok!";
		System.out.println(varString);
		
	}
}
