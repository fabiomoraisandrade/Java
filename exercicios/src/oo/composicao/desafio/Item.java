package oo.composicao.desafio;

public class Item {

	//Relação de n pra 1 (Muitos itens tem 1 produto)
	final Produto produto;
	final int quantidade;
	
	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
