
public class Carro {

	public String vNome = "Opala";
	public String vModelo = "Opala Diplomata Coupe 1987";
	public int vAno = 1987;

	String[] acessorios = { "Farol de Led", 
			"Suporte Celular", 
			"Roda Cromada", 
			"Aro 16"
	};
	
	public void acelerar() {
		System.out.println("Vruummm");
	}

	public double calculaConsumo(double km) {
		return km / 6.61;
	}
}
