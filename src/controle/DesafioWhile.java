package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		// Usuario digitar nota valida 0<=nota<=10
		// Armazenar a nota na variavel total e acrescentar a essa variavel as demais notas que o usuario informar
		// Utilizar um contador para contar o numero de notas validas informadas pelo usuario
		// Mostrar a media no final
		// O criterio de parada sera quandp o usuario digitar -1.
		
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		int contador = 0;
		double media = 0;
		 while (nota != -1) {
			 System.out.print("Informe a nota: ");
			 nota = entrada.nextDouble();
			 
			 if (nota <= 10 && nota >= 0) {
				 total += nota;
				 contador++;
			 } else if (nota != -1) {
				 System.out.println("Nota invalida!");
			 }
		 }
		
		media = total / contador;
		System.out.print("A media das notas e: " + media);
		
		entrada.close();
	}
}
