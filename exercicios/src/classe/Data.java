package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
//	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
//	}
//	
//	Data (int diaInicial, int mesInicial, int anoInicial) {
//		dia = diaInicial;
//		mes = mesInicial;
//		ano = anoInicial;
//	}
	
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
		//this(1, 1, 1970); Essa é outra forma de usar o this. Dessa forma ele é usado como método que chama outro construtor (no caso chama o construtor Data() de baixo que recebe 3 parâmetros que estão chegando através dos parâmetros no primeiro construtor pelo this.
	}
	
	//O this aponta para o objeto atual que está executando esse código. Então o primeiro uso do this é para referenciar o objeto atual e não a classe.
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
//		return dia + "/" + mes + "/" + ano;
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
//	static void teste() {
//		this.dia = 3;   Aqui o this não está disponível pois o método static está relacionado a classe e não ao objeto atual que o this aponta.
//	}
}
