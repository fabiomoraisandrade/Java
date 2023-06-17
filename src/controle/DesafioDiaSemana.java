package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//Criar um scanner para o usuario digitar o 
		//numero da semana e o programa retornar o
		//numero associado a esse dia
		//Digitar Domingo e o programa retornar 1
		// quarta -> 4
		// terça -> 3
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe algum dia da semana: ");
		String day = entrada.next();
		
		if (day.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (day.equalsIgnoreCase("terca") ||
				day.equalsIgnoreCase("terça")) {
			System.out.println("3");
		} else if (day.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (day.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (day.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (day.equalsIgnoreCase("sabado") ||
				day.equalsIgnoreCase("sábado")) {
			System.out.println("7");
		} else if (day.equalsIgnoreCase("domingo")){
			System.out.println("1");
		} else {
			System.out.println("Dia invalido!");
		}
		
		entrada.close();
		
	}
}
