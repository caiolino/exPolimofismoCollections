package animaisPolimorfismo;

public class main {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro("maju",3);
		Gato cat = new Gato("Lyra",1);
		Cavalo horse = new Cavalo("cavalo",5);
		
		Veterinario vet = new Veterinario();
		
		System.out.println("Cachorro:");
		dog.mover();
		vet.examinar(dog);

		
		System.out.println("Gato:");
		cat.mover();
		vet.examinar(cat);

		
		System.out.println("Cavalo:");
		horse.mover();
		vet.examinar(horse);
		
	}

}
