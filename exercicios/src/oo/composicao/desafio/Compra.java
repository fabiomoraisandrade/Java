package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	//Relação 1 pra n (1 compra tem n itens)
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	//Metodo que retorna o valor total de uma compra
	double obterValorTotal() {
		double total = 0;
		
		for (Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
