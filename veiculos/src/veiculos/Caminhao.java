package veiculos;

public class Caminhao extends Veiculo {
	
	private float toneladas;
	private float alturaMax;
	private float comprimento;
	
	public void EntrCAm(float toneladas,float alturaMax,float comprimento) {
		this.toneladas = toneladas;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}
	
	public void MostrCam() {
		System.out.println("Altura Maxima: "+this.alturaMax);
		System.out.println("toneladas"+this.toneladas);
		System.out.println("comprimento"+this.comprimento);
	}

}
