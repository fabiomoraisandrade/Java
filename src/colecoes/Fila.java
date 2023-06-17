package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// .offer e .add -> adiciona elementos na fila
		// Diferença é o comportamento quando a fila está cheia
		
		fila.add("Ana"); //Lança exceção quando a fila está cheia
		fila.offer("Bia"); //Retorna falso quando a fila está cheia
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// .peek e .element -> obtem o próximo elemento da fila (sem remover)
				// Diferença é o comportamento quando a fila está vazia
		
		System.out.println(fila.peek()); //retorna null se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção se a fila está vazia
		System.out.println(fila.element());
		
		System.out.println(fila.poll()); //remove elemento da lista e retorna null se não tiver nenhum
		System.out.println(fila.remove()); //remove elemento da lista e lança exceção se não tiver nenhum
		
	}
}
