package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		//Ler num1
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		//Ler num2
		System.out.println("\nDigite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		//Pedir pro usuário a operação matemática (+ - * / %)
		System.out.println("Qual a operacao matematica desejada? ");
		String operation = entrada.next();
		
		Double result = "+".equals(operation) ? num1 + num2 : 0;
		result = "-".equals(operation) ? num1 - num2 : result;
		result = "*".equals(operation) ? num1 * num2 : result;
		result = "/".equals(operation) ? num1 / num2 : result;
		result = "%".equals(operation) ? num1 % num2 : result;
		
		// Mostrar o resultado
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operation, num2, result);
		entrada.close();
	}
}
