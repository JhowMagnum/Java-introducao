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
		
		//Subtra��o
		total = numA - numB;
		System.out.println(total);
		
		
		//Multiplica��o 
		total = numA * numB;
		System.out.println(total);
		
		//Divis�o
		double numC, numD, totalDouble;
		numC = numA;
		numD = numB;
		totalDouble = numC / numD;
		System.out.println(totalDouble);
		
	   // Resto da Divis�o (MOD) Dica: Isso serve para saber quando o n�mero � PAR ou �MPAR
		total = numA % numB;
		System.out.println(total);
		
		//Potencia��o
		double numE, numF, potencia;
		numE = numA;
		numF = numB;
		potencia = Math.pow(numE , numF)   ;
		System.out.println(potencia);
		
		//Radia��o (Raiz quadrada)
		double raiz;
		raiz = Math.sqrt(9);
		System.out.println(raiz);
		
		//Raiz C�bica
		raiz = Math.cbrt(27);
		System.out.println(raiz);
		
	}

}
