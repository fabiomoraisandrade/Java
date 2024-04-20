package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 29;
		d1.mes = 3;
		d1.ano = 2023;
		
		Data d2 = new Data();
		d2.dia = 2;
		d2.mes = 12;
		d2.ano = 2022;
		
		//Desafio
		
		Data d3 = new Data();
		System.out.println(d3.obterDataFormatada());
		
		Data d4 = new Data(4, 4, 2023);
		System.out.println(d4.obterDataFormatada());
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
		
		String dataFormatada = d1.obterDataFormatada();
		System.out.println(dataFormatada);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
	}
}
