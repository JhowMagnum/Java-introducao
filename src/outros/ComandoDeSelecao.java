package outros;
import java.util.Scanner;
public class ComandoDeSelecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vNum; 
		
		Scanner escolha = new Scanner(System.in);
		
		System.out.printf("Escolha um número: ");
		vNum = escolha.nextInt();
		System.out.println("\n");
		
		switch(vNum) {
		
		case 1: 
			System.out.println("O numero escolhido foi: 1");
			break;
		case 2:
			System.out.println("O numero escolhido foi: 2");
			break;
		case 3:
			System.out.println("O numero escolhido foi: 3");
			break;
		default:
			System.out.println("O numero escolhido foi: "+vNum);
			break;
		}

	}

}
