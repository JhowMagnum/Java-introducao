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
		System.out.printf("A frase é: "+vFrase+space);
		
		/*Imprime somente uma palavra, por causa do next()*/
		System.out.printf("Informe duas palavra: ");
		vString = entrada.next();
		
		System.out.printf("A frase é: "+vFrase+space);
		System.out.printf("A palavra é: "+vString+space);
		
		/*Imprime valores Inteiro com a mudança do nextInt()*/
		//System.out.printf("Informe um número inteiro: ");
		//vInteiro = entrada.nextInt();
		//System.out.printf("O número inteiro é: "+vInteiro);
		
		/*Imprime Valores Double com a mudança do nextDouble()*/
		//System.out.printf("Informe um Double: ");
		//vDouble = entrada.nextDouble();
		//System.out.printf("O Double é: "+vDouble);
		
		/*Imprime Valores Float com a mudança do nextFloat()*/
		//System.out.printf("Informe número Real: ");
		//vFloat = entrada.nextFloat();
		//System.out.printf("O número real é: "+vFloat);
		
		
	}

}
