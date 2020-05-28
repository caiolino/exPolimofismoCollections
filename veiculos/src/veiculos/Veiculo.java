package veiculos;

public abstract class Veiculo {
	
	protected float veloMax;
	protected float peso;
	protected float preco;
	
	public void EntrVeic(float veloMax, float peso, float preco) {
		this.veloMax = veloMax;
		this.peso = peso;
		this.preco = preco;
	}
	
	public void MostrVeic() {
		System.out.println("Velocidade Maxima: "+this.veloMax+"km/h");
		System.out.println("Preco"+this.preco+"RS");
		System.out.println("Peso"+this.peso+"kg");
	}

}
