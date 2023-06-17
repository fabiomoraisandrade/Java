package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //O L no final significa que o valor da variável passou da capaciade de armazenamento desse tipo e é necessário usar o L para indicar que ele é um long maior.
		
		//Tipos numéricos reais
		float salario = 11_445.44F; //O F no final é necessário porque todo numero flutuante no Java é do tipo Double. O F na frente significa para falar para o Java que esse numero é do tipo float.
		double vendasAcumuladas = 2_991_797_102.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A'; //Funcionario Ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
