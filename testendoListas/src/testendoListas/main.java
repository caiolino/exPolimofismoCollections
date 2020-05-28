package testendoListas;

import java.util.List;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		ArrayList<String> aulas = new ArrayList<>();//instancia a lista
		aulas.add(aula1);//adiciona itens
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);//print em formato de array
		System.out.println(aulas.size());//tamanho do array
		
		
		//percore e printa os itens
		for (int i = 0; i < aulas.size(); i++) {
		System.out.println("Aula: " + aulas.get(i));
		}
		
		
	}

}
