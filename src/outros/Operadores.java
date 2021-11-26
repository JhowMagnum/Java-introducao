package outros;
import java.lang.Math;
import java.util.Scanner;
public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numA = 5;
		int numB = 2;
		int total;
		
		// Soma
		total = numA + numB;
		System.out.println(total);
		
		//Subtração
		total = numA - numB;
		System.out.println(total);
		
		
		//Multiplicação 
		total = numA * numB;
		System.out.println(total);
		
		//Divisão
		double numC, numD, totalDouble;
		numC = numA;
		numD = numB;
		totalDouble = numC / numD;
		System.out.println(totalDouble);
		
	   // Resto da Divisão (MOD) Dica: Isso serve para saber quando o número é PAR ou ÍMPAR
		total = numA % numB;
		System.out.println(total);
		
		//Potenciação
		double numE, numF, potencia;
		numE = numA;
		numF = numB;
		potencia = Math.pow(numE , numF)   ;
		System.out.println(potencia);
		
		//Radiação (Raiz quadrada)
		double raiz;
		raiz = Math.sqrt(9);
		System.out.println(raiz);
		
		//Raiz Cúbica
		raiz = Math.cbrt(27);
		System.out.println(raiz);
		
	}

}
