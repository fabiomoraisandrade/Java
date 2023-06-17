package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero de notas: ");
		int n = entrada.nextInt();
		
		double[] notas = new double [n];
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("\nDigite a %d nota: ", i + 1);
			notas[i] = entrada.nextDouble();
		}
//		System.out.println(Arrays.toString(notas));
		
		double soma = 0.0;
		for(double nota : notas) {
			soma += nota;
		}
		
		double media = soma / notas.length;
		
		System.out.printf("A media das notas e: %f", media);
			
		entrada.close();
	}
}
