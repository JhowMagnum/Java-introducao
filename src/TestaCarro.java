import java.util.Scanner;
public class TestaCarro {

	public static void main(String[] args) {
		
		Carro carroUm = new Carro();
		
		System.out.println("Nome do Carro:"+ carroUm.vNome);
		System.out.println("Modelo: "+carroUm.vModelo);
		System.out.println("Ano: "+ carroUm.vAno);
		 for (int contador = 0; contador < carroUm.acessorios.length; contador++) {
			 System.out.println(carroUm.acessorios[contador]);
		 }
		
		carroUm.acelerar();
		
		Scanner entrada = new Scanner(System.in);
		 System.out.printf("Digite a KM: ");
		 int vKM = entrada.nextInt();
		 
		
		 
		 
		 System.out.println(carroUm.calculaConsumo(vKM));
	}

}
