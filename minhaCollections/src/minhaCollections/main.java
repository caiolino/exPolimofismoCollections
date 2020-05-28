package minhaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lista: Interface ArrayLista:IMplementação
		
		//O lista aceita dupicaçãp
	    List<Integer> minhaLista = new ArrayList<Integer>();//Instancia a lista minha\lista
	    minhaLista.add(1); //adiciona os itens
	    minhaLista.add(2);
	    minhaLista.add(2);
	    minhaLista.add(1);
	    
	    //varre alista e printa os itens dela
	    for (Integer listaElementos : minhaLista) {
	        System.out.println(listaElementos);
	    }
	    
	    System.out.println();
	    
	    //Set: Interface  HashSetImplementção
	    
	    //O set nao aceita duplicação
	    Set<Integer> meuSet = new HashSet<Integer>();//Instancia a lista meuSet
	    meuSet.add(1);//adiciona os itens
	    meuSet.add(2);
	    meuSet.add(3);
	    meuSet.add(1);
	    Iterator<Integer> iMeuSet = meuSet.iterator(); //usando iterator para capturar os elementos da lista
	    while(iMeuSet.hasNext()){
	    	System.out.println(iMeuSet.next());
	    }

	}

}
