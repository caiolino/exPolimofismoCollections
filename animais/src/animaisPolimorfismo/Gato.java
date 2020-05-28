package animaisPolimorfismo;

public class Gato extends Animal {
	
	public Gato() {
		super();
	}
	
	public Gato(String nome, int idade) {
		super(nome, idade);
		super.setSom("miado");
		super.setMovimento("Subindo arvore");

	}
	
	public void fazerSom() {
		System.out.println(this.som);
	}
	
	public void mover() {
		System.out.println(this.movimento);
	}

}
