package veiculos;

public class CarroPasseio extends Veiculo{
	
	private String cor;
	private String modelo;
	
	public void EntrPass(String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
	}
	
	public void MostrPass() {
		System.out.println("cor: "+this.cor);
		System.out.println("Modelo"+this.modelo);
	}
	
}
