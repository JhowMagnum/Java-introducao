package outros;
import java.util.Scanner;
public class Cliente {
	public static void main(String[] args) {
		
		
		
		Scanner dados = new Scanner(System.in);
		
		// Agencia
		System.out.println("N�mero da Agencia: ");
		int vAgencia = dados.nextInt(); 
		//System.out.print(vAgencia);
		
		// Conta
		System.out.println("\n N�mero da Conta: ");
		int vConta = dados.nextInt();
		//System.out.println(vConta);
		
		// CPF
		System.out.println("\n N�mero do CPF: ");
		String vCpf = dados.nextLine();
		
		//Nome
		System.out.println("\n Digite seu Nome:");
		String vNome = dados.nextLine();
		
		// Data de Nascimento
		System.out.println("\n Data de Nascimento: ");
		String vNascimento = dados.nextLine();
		
		// Endere�o
		System.out.println("\n Endere�o: ");
		String vEndereco = dados.nextLine();
		
		// Telefone
		System.out.println("N�mero do Telefone: ");
		String vTelefone = dados.nextLine();
		
		// Saldo
		System.out.println("Saldo: ");
		double vSaldo = dados.nextDouble();
		
		// Senha 
		System.out.println("Senha: ");
		String vSenha = dados.nextLine();
		
		
		
		
	}
}
