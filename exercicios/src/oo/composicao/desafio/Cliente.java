package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	//Relação de 1 pra n (1 cliente tem n compras)
	final List<Compra> compras = new ArrayList<>();
	final String nome;
	
	//Construtor de cliente
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	//Metodo que retorna o valor total de todas as compras que o cliente fez
	double obterValorTotal() {
		double total = 0;
		
		//Aqui não é preciso calcular o valor total de cada compra pois isso já foi feito no método da classe Compra
		for (Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}
