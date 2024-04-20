package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		entrada.close();
		
		Double s1 = Double.parseDouble(salario1);
		Double s2 = Double.parseDouble(salario2);
		Double s3 = Double.parseDouble(salario3);
		
		Double media = (s1 + s2 + s3) / 3;
		
		System.out.println("A media dos salarios é: " + media);
	}
}
