package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();  //O método nextLine não tira os espaços, sendo necessário usar o .trim(). Já o next() já tira todos os espaços.
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		//Para comparar strings é necessário usar o .equals()
		
		entrada.close();
	}
}
