package telefone;

import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List<Telefone> lista = new ArrayList<Telefone>();
		
		Telefone n1 = new Telefone("93924-4993",2);
		Telefone n2 = new Telefone("3924-0000",1);
		
		lista.add(n1);
		lista.add(n2);
		
		Iterator<Telefone> itr = lista.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getNrTelefone());

		}	
	}

}