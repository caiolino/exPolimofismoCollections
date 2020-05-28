package animaisPolimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo() {
		super();
	}
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		super.setSom("som de cavalo");
		super.setMovimento("correndo");

	}
	
	public void fazerSom() {
		System.out.println(this.som);
	}
	
	public void mover() {
		System.out.println(this.movimento);
	}

}
