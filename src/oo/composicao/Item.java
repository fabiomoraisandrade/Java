package oo.composicao;

public class Item {

	String nome;
	int quantidade;
	double preco;
	
	//Construtor que já recebe os 3 atributos acima
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
