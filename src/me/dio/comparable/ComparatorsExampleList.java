package me.dio.comparable;

/* Resumindo:
 *  Comparators e Comparables, s�o interfaces auxiliares
 *  da API de Collections, para que seja poss�vel
 *  trabalhar a ordena��o de cole��es
 * 
 * Exemplos de Implementa��es: 
 * - Set ( pois permite a ordena��o de acordo com o indice de dados )
 * --- TreeSet
 * --- TreeMap
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import me.dio.comparator.Estudante;
import me.dio.comparator.ExemploComparator;

public class ComparatorsExampleList {

	public static void main(String[] args) {
		
      List<Estudante> estudantes = new ArrayList<>(); 
      
      estudantes.add(new Estudante("Pedro", 19));
      estudantes.add(new Estudante("Carlos", 23));
      estudantes.add(new Estudante("Mariana", 21));
      estudantes.add(new Estudante("Jo�o", 18));
      estudantes.add(new Estudante("Thiago", 20));
      estudantes.add(new Estudante("George", 22));
      estudantes.add(new Estudante("Larissa", 21));
      
      System.out.println("---ordem de inser��o---");
      System.out.println(estudantes);
      // Ultiliza��o da sintaxe lambda Inicio [
      // Organizando a lista de Estudante de acordo com a idade ( Crescente )
      estudantes.sort((first, second)-> first.getIdade() - second.getIdade());
      
      System.out.println("--- ordem natural dos n�meros - idade ---");
      System.out.println(estudantes);
      
     // Organizando a lista de Estudante de acordo com a idade ( Decrescente )
      estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
      
      System.out.println("--- ordem inversa dos n�meros - idade ---");
      System.out.println(estudantes);
      
     // ] Fim 
      
     // Utiliza��o da Classe Comparator Incio [
     // Organizando de acordo com o m�todo de refer�ncia dentro do Comparator 
      estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
      
      System.out.println("--- ordem natural dos n�meros - idade  (Method Reference)---");
      System.out.println(estudantes);
      
      estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
      
      System.out.println("--- ordem inversa dos n�meros - idade  (Method Reference)---");
      System.out.println(estudantes);
      
      // ] Fim 
      
      Collections.sort(estudantes);
      System.out.println("--- ordem natural dos n�meros - idade  (interface Comparable)---");
      System.out.println(estudantes);
      
      Collections.sort(estudantes, new ExemploComparator());
      System.out.println("--- ordem inversa dos n�meros - idade  (interface Comparator)---");
      System.out.println(estudantes);
	}

}
