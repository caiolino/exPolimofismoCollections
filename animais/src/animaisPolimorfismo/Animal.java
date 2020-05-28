package animaisPolimorfismo;

public abstract class Animal {
	
	protected String nome;
	protected int idade;
	protected String som;
	protected String movimento;
	
	protected Animal() {
		nome = "sem nome";
		idade = 0;
		som = "em silencio";
	}
	
	protected Animal(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public abstract void fazerSom();
	
	public abstract void mover();

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
}
