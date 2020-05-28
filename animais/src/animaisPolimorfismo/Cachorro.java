package animaisPolimorfismo;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super();
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		super.setSom("latido");
		super.setMovimento("correndo");

	}

	public void fazerSom() {
		System.out.println(this.som);
	}
	
	public void mover() {
		System.out.println(this.movimento);
	}
		
}
