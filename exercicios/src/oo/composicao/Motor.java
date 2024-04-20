package oo.composicao;

public class Motor {

	boolean ligado = false;
	double fatorInjecao = 1;
	
	//Metodo que retorna a quantidade de giros se tanto de fator de injeção for usado
	//Quando o carro está em marcha lenta o fator padrao é 1. Quando acelera, o fator aumenta
	int giros() {
		if (!ligado ) {
			return 0;
		}
		return (int) Math.round(fatorInjecao * 3000);
	}
}
