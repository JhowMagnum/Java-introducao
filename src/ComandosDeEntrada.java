import java.util.Scanner;
public class ComandosDeEntrada {
	
	public static void main(String[] args) {
	
		int vInteiro;
		double vDouble;
		String vString;
		String vFrase;
		float vFloat;
		String space = "\n";
		
		Scanner entrada = new Scanner(System.in);
		
		/* Imprime toda frase por causa do nextLine()*/
		System.out.printf("Informe uma frase: ");
		vFrase = entrada.nextLine();
		System.out.printf("A frase �: "+vFrase+space);
		
		/*Imprime somente uma palavra, por causa do next()*/
		System.out.printf("Informe duas palavra: ");
		vString = entrada.next();
		
		System.out.printf("A frase �: "+vFrase+space);
		System.out.printf("A palavra �: "+vString+space);
		
		/*Imprime valores Inteiro com a mudan�a do nextInt()*/
		//System.out.printf("Informe um n�mero inteiro: ");
		//vInteiro = entrada.nextInt();
		//System.out.printf("O n�mero inteiro �: "+vInteiro);
		
		/*Imprime Valores Double com a mudan�a do nextDouble()*/
		//System.out.printf("Informe um Double: ");
		//vDouble = entrada.nextDouble();
		//System.out.printf("O Double �: "+vDouble);
		
		/*Imprime Valores Float com a mudan�a do nextFloat()*/
		//System.out.printf("Informe n�mero Real: ");
		//vFloat = entrada.nextFloat();
		//System.out.printf("O n�mero real �: "+vFloat);
		
		
	}

}
