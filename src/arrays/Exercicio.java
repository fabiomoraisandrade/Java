package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		//O array é fixo (Uma vez definido seu tamanho que é 4, ele não muda de tamanho)
		//O array é homogeneo(Uma vez definido seu tipo, nenhum conteúdo dentro dele pode ser de tipo diferente)
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA.length - 1);
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaAmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaAmazenada, 10}; //Inicialização do array de forma direta
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}