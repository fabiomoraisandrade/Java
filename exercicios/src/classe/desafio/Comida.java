package classe.desafio;

public class Comida {

	//Atributos da instancia. É necessário gravar os valores desses atributos através dos métodos que recebem os parâmetros para fazer essa gravação
	String nome;
	double peso;
	
	//Construtor (metodo) responsável por receber os parâmetros e gravar os valores deles no objeto.
	Comida(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
}
