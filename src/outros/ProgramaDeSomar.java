package outros;
import java.util.Scanner;

public class ProgramaDeSomar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA ;
		int numB ;
		
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		
	 	System.out.printf("Informe um valor: ");
		numA = n1.nextInt();
		
		
		System.out.printf("Informe outro valor: ");
		numB = n2.nextInt();
		
		int total = numA + numB;
		System.out.println("A soma de "+numA+" e "+numB+" é: "+total);
	}

}
