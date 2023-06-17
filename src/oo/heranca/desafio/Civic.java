package oo.heranca.desafio;

public class Civic extends Carro {

	//Como Civic é uma classe filha de carro, e foi definido um construtor para Carro, é necessário definir um construtor em Civic e também em Ferrari que chame o construtor da classe pai
	public Civic() {
		super(212);
	}
}
