package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso; //O peso da comida está sendo acrescentado ao peso da pessoa. O this serve para referênciar o objeto pessoa atual. Por exemplo, o objeto pessoa 1 vai ter um peso diferente do objeto pessoa 2.
		}
	}
	
	String apresentar() {
		return "Ola, eu sou o " + nome + " e tenho " + peso + " kg.";
	}
}
