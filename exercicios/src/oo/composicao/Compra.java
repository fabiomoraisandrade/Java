package oo.composicao;

import java.util.ArrayList;

public class Compra {

	// Relação de 1 para n. Uma compra tem muitos itens e 1 tem uma compra
	ArrayList<Item> itens = new ArrayList<Item>();
	String cliente;
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
