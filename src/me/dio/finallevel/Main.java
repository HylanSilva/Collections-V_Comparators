package me.dio.finallevel;

/*  ## 1- Crie uma Lista de um objeto complexo e execute as seguintes opera��es:
 * Adicione elementos nesta lista.
 * Ordene implementando a interface java.util.Comparator no seu objeto complexo.
 * Ordene implementando um novo objeto com a interface java.util.Comparable
 * Ordene usando uma express�o lambda na chamada de suaLista.sort()
 * Ordene usando refer�ncias de m�todos e as m�dtodos est�ticos de Comparator
 * Ordene cole��es TreeSet e TreeMap
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Contato> listaContatos = new ArrayList<>();
		
		// Adicione elementos nesta lista.
		listaContatos.add(new Contato("Painho", 994347856));
		listaContatos.add(new Contato("Mainha", 997149814));
		listaContatos.add(new Contato("Vov� Sebastiana", 992887426));
		listaContatos.add(new Contato("Vov� Carminha", 972347891));
		listaContatos.add(new Contato("Tio Lau", 977275863 ));

		System.out.println(listaContatos);
		// Ordene implementando a interface java.util.Comparator no seu objeto complexo.
		System.out.println(" ");
		listaContatos.sort(Comparator.comparing(Contato::getNome));
		System.out.println(listaContatos);
		
		// Ordene implementando um novo objeto com a interface java.util.Comparable
		System.out.println(" ");
		Collections.sort(listaContatos);
		System.out.println(listaContatos);
		//Ordene usando uma express�o lambda na chamada de suaLista.sort()
		System.out.println(" ");
		listaContatos.sort((first, second)-> first.getNumero() - second.getNumero());
		System.out.println(listaContatos);
		System.out.println(" ");
		// Ordene usando refer�ncias de m�todos e os m�todos est�ticos de Comparator
		Comparator<Contato> comparator = new Comparator<Contato>() {
            @Override
            public int compare(Contato o1, Contato o2) {
                return o1.getNumero().compareTo(o2.getNumero());
            }
        };
        listaContatos.sort(comparator);
        listaContatos.forEach(o1 -> System.out.println(o1.getNome()));
        System.out.println(listaContatos);
		// Ordene cole��es TreeSet
		Iterator<Contato> iterator = listaContatos.iterator(); 
		while ( iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Ordene cole��es TreeMap
	
	}
}