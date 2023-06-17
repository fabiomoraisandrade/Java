package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //Atribuição por valor (copia do valor é definido na memória
		
		a++;
		b--;
		
		System.out.println(a + " " + b); //Valores de a e b independentes
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //Atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada()); //Valores de d1 e d2 são dependentes pois as duas variáveis apontam para o mesmo objeto na memória.
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	//O método estatico só consegue acessar outro método estático (no caso o main)
	//Esse método recebe como parâmetro um objeto que na verdade recebe o endereço de memória. Assim, se for passado d1, os valores de d1 serão modificados por esse método e também os valores de d2 já uqe d1 = d2 que apontam para um endereço de memória.
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	//Para tipos primitivos, é passado uma cópia do valor como paràmetro, ou seja, terá um valor independente e o valor do tipo primitivo não será alterado.
	static void alterarPrimitivo(int c) {
		c++;
	}
}
