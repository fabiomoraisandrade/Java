package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25; //Uma vez que o desconto ficou estatico, já não faz mais sentido deixar ele no construtor, pois passa a falsa sensação de que o objeto criado a partir dessa classe tenha o valor do desconto proprio. Assim é mais claro acessar esse valor e mudá-lo quando necessário a aprtir da classe.
		
	Produto(String nomeInicial, double precoInicial) { //Construtor - Forma explicita (Quando o construtor explicito é definido, o Java perde o construtor padrão que vem implícito em cada classe. O construtor tem o mesmo nome da classe.
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto() { //Construtor padrão restabelecido depois de declarar um explícito. Pode exister mais de um construtor na classe.
		
	}
	
//	Esse método não recebe nenhum parâmetro porque todas as informações necessárias para esse método já está nesta classe.
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
//	Esse método recebe um parâmetro de desconto do gerente. Como os dois métodos tem o mesmo nome, o Java sabe qual método usar pela assinatura do método. Se for passado um parâmetro, ele irá utilizar esse método. Se não, irá utilizar o método de cima que não tem parâmetro.
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
