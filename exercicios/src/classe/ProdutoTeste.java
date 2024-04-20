package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
//		int a = 3;
//		Scanner entrada = new Scanner(System.in);
//	    Tipo    nome var  new é a palavra reservada do java que é responsável por chamar o construtor. O construtor tem o mesmo nome da classe. Então se você quer criar uma classe do tipo Scanner, tem que chamar o construtor Scanner.
		Produto p1 = new Produto("Notebook", 4356.89);
		// p1.nome = "Notebook";
		// p1.preco = 4356.89;
		// p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//p2.desconto = 0.29;
		Produto.desconto = 0.5;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
	}
}
